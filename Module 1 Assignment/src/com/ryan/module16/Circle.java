package com.ryan.module16;

public class Circle extends TwoDShape {
    private final double pi = Math.PI;
    private double radius;

    //default constructor
    public Circle(){
        super(Colour.NONE);
        radius = 0;
    }

    //regular constructor
    public Circle(double inRadius, Colour inColour){
        super(inColour);
        radius = inRadius;
    }

    //getArea method
    public double getArea(){
        return (pi * (radius * radius));
    }

    public String toString() {
        return "Circle - radius: " + radius
                + " - Colour: " + getColour();
    }

    //getters and setters
    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }


}
