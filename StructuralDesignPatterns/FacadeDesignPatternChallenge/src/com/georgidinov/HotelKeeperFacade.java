package com.georgidinov;

public class HotelKeeperFacade {

    private NonVegRestaurant nonVegRestaurant;
    private VegRestaurant vegRestaurant;
    private VegNonBothRestaurant bothRestaurant;

    public HotelKeeperFacade(NonVegRestaurant nonVegRestaurant,
                             VegRestaurant vegRestaurant,
                             VegNonBothRestaurant bothRestaurant) {
        this.nonVegRestaurant = nonVegRestaurant;
        this.vegRestaurant = vegRestaurant;
        this.bothRestaurant = bothRestaurant;
    }//end of constructor

    public void getNonVeganMenu() {
        nonVegRestaurant.getMenus().showMenu();
    }

    public void getVeganMenu() {
        vegRestaurant.getMenus().showMenu();
    }

    public void getBothNonVegAndVegMenus() {
        bothRestaurant.getMenus().showMenu();
    }

}//end of class HotelKeeperFacade
