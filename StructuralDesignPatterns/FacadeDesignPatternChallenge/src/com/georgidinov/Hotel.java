package com.georgidinov;

interface Hotel {
    Menus getMenus();
}//end of interface Hotel

class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}//end of class NonVegRestaurant

class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}//end of class VegRestaurant

class VegNonBothRestaurant implements Hotel {
    public Menus getMenus() {
        Both b = new Both();
        return b;
    }
}//end of class VegNonBothRestaurant



