package com.georgidinov;

public interface Color {
    void fillWithColor(int borderSize);
}//end of interface Color

class Red implements Color {

    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("Painted in RED color with border size " + borderSize + " inches.");
    }

}//end of class Red

class Green implements Color {

    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("Painted in GREEN color with border size " + borderSize + " inches.");
    }

}//end of class Green