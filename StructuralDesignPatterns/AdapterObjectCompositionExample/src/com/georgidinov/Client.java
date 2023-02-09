package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The turkey says");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nTurkey adapter says");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
