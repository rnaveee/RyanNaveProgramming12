package com.ryan.module17;

public abstract class TwoDShape {

    //attributes
    private Colour colour;
    private double height;
    private double width;

    //default constructor
    public TwoDShape(Colour inColour){
        colour = inColour;
        height = 0;
        width = 0;
    }

    //constructor
    public TwoDShape(double inHeight, double inWidth, Colour inColour){
        colour = inColour;
        height = inHeight;
        width = inWidth;
    }

    //abstract methods

    //getArea method
    public abstract double getArea();
    public abstract String toString();

    //getters and setters
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public Colour getColour(){
        return colour;
    }


}
