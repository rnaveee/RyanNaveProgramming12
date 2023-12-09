package com.ryan.module14;

public abstract class TwoDShape {

    private Colour colour;
    private double height;
    private double width;

    public TwoDShape(Colour inColour){
        colour = inColour;
        height = 0;
        width = 0;
    }

    public TwoDShape(double height, double width, Colour colour){
        this.colour = colour;
        this.height = height;
        this.width = width;
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

    public Colour getColour(){
        return colour;
    }

    public abstract String toString();
}
