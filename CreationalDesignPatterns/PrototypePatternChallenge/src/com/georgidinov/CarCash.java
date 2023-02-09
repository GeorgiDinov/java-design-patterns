package com.georgidinov;

import java.util.HashMap;
import java.util.Map;

public class CarCash {

    private static Map<String, BasicCar> carMap = new HashMap<>();

    static {
        Nano nano = new Nano();
        carMap.put(nano.getName(), nano);

        Ford ford = new Ford();
        carMap.put(ford.getName(), ford);
    }//end of SIB

    public static BasicCar getCashedCar(String carName){// throws CloneNotSupportedException{
        BasicCar cashedCar = carMap.get(carName);
        return (BasicCar) cashedCar.clone();
    }//end of method getCashedCar

}//end of class CarCash
