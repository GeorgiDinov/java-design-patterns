package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        HotelKeeperFacade hotelKeeper = new HotelKeeperFacade(new NonVegRestaurant(),
                new VegRestaurant(), new VegNonBothRestaurant());

        hotelKeeper.getNonVeganMenu();
        System.out.println();
        hotelKeeper.getVeganMenu();
        System.out.println();
        hotelKeeper.getBothNonVegAndVegMenus();

        System.out.println("\nJason HotelKeeper implementation: ");
        HotelKeeperJason keeper = new HotelKeeperJason();
        NonVegMenu nvm = keeper.getNonVegMenu();
        VegMenu vm = keeper.getVegMenu();
        Both both = keeper.getNonAndVegMenu();

    }//end of main method

}//end of class Client
