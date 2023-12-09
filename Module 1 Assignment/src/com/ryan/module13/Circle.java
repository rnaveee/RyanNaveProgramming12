package com.ryan.module13;

public class Circle extends TwoDShape {
    private final double pi = Math.PI;
    private double radius;

    public Circle(){
        radius = 0;
    }
    public double getArea(){
        return (pi * (radius * radius));
    }

    public String toString() {
        return "Circle - radius: " + radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }


}
