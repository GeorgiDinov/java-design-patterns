package com.georgidinov;

public class HotelKeeperJason {

    public VegMenu getVegMenu() {
        VegRestaurant vr = new VegRestaurant();
        return (VegMenu) vr.getMenus();
    }//end of method getVegMenu

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nvr = new NonVegRestaurant();
        return (NonVegMenu) nvr.getMenus();
    }//end of method getVegMenu

    public Both getNonAndVegMenu() {
        VegNonBothRestaurant bnvr = new VegNonBothRestaurant();
        return (Both) bnvr.getMenus();
    }//end of method getVegMenu


}//end of class HotelKeeperJason
