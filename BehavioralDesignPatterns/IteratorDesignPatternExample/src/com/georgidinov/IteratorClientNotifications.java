package com.georgidinov;

class IteratorClientNotifications {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Iterator Design Pattern>>>\n");
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();

    }//end of main method

}//end of class Main
