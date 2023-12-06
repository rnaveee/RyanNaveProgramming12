package com.ryan.module12;

public abstract class TwoDShape {

    private double height;
    private double width;

    public TwoDShape(){
        height = 0;
        width = 0;
    }

    public TwoDShape(double inHeight, double inWidth){
        height = inHeight;
        width = inWidth;
    }

    public abstract double getArea();

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

    public abstract String toString();
}
