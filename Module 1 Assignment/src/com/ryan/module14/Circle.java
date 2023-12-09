package com.ryan.module14;

public class Circle extends TwoDShape {
    private final double pi = Math.PI;
    private double radius;


    public Circle(){
        super(Colour.NONE);
        radius = 0;
    }

    public double getArea(){
        return (pi * (radius * radius));
    }

    public String toString() {
        return "Circle - radius: " + radius
                + " - Colour: " + getColour();
    }

    public Circle(double radius, Colour inColour){
        super(inColour);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }


}
