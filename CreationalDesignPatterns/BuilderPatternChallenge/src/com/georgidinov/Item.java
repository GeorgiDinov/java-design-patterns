package com.georgidinov;

public interface Item {
    String getName();

    double getPrice();

    String getPackIng();
}//end of interface Item

abstract class AbstractBurger implements Item {
    protected Pack pack = new Wrapper();
}//end of abstract class AbstractBurger

abstract class ColdDrink implements Item {
    protected Pack pack = new Bottle();
}//end of abstract class ColdDrink

class Burger extends AbstractBurger {
    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return 2.5d;
    }

    @Override
    public String getPackIng() {
        return pack.pack();
    }
}//end of class Burger

class VegBurger extends AbstractBurger {
    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 2.0d;
    }

    @Override
    public String getPackIng() {
        return pack.pack();
    }
}//end of class VegBurger

class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coca-Cola";
    }

    @Override
    public double getPrice() {
        return 0.75d;
    }

    @Override
    public String getPackIng() {
        return pack.pack();
    }
}//end of class Coke

class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi-Cola";
    }

    @Override
    public double getPrice() {
        return 0.70d;
    }

    @Override
    public String getPackIng() {
        return pack.pack();
    }
}//end of class Pepsi
