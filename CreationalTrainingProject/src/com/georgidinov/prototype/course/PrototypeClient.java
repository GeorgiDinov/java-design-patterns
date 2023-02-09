package com.georgidinov.prototype.course;

//Use Prototype design pattern when object creation is expensive, avoid "new"
//Overall get some common abstract class or interface among the products
//in this case class AbstractCar and it subclasses
//Figure out how you are going to copy your objects
//Cloneable, copy constructor or serialization deserialization(in memory or regular)
//Make class which is going to keep the objects you want to clone cashed
//Let the Client use the class with the cashed objects and retrieve the copies.
//
//--------------------------Additional Info------------------------------------
//Three major approaches to copying objects
//First and probably most common using the Cloneable interface
//Second known as the "C++" commonly used way is with cloning(copy) constructor
//Third is with serialization and deserialization using the Serializable interface
//If the Cloneable interface is used we have to mind that this may produce
//shallow copy of the object
//
//  If subclasses have only primitive types for member variables and they are the same
//as the superclass one's there is no need to override the clone() method
//  But if we have more fields in the subclass than the superclass we have to override the clone method
//for the subclass
//  If we have reference types we have to make sure that they
//implement their own clone method, because  only the reference will be copied
//this is known as shallow copy
//This can lead to problems because the "original" and the "copy"
//will share same object/objects through their references
//and we will have consistency issues
//If all reference types have their own clone method implementation then not only the reference
//but also and the object they refer to will be copied
// "==" with objects check if they are at the same address in memory
// "equals()" checks fields values
//when we override equals our first step is to check if(this==obj){return true;}
//and then proceed with further comparisons
//
class PrototypeClient {

    public static void main(String[] args) {
        AbstractCarCashingClass.loadData();
        Ford fordCopy = null;
        try {
            AbstractCar ford = AbstractCarCashingClass.getClone("Ford");
            fordCopy = (Ford) ford.clone();
            AbstractCar audi = AbstractCarCashingClass.getClone("Audi");
            System.out.println("Clone of " + ford.getName() + " with price: " + ford.getPrice());
            System.out.println("Clone of " + audi.getName() + " with price: " + audi.getPrice());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure..." + e.getMessage());
        }

        System.out.println("Clone the clone = " + fordCopy.getName() + " price = " + fordCopy.getPrice() +
                " with extra field = " + fordCopy.getTestVariable());

    }//end of main method

}//end of class PrototypeClient
