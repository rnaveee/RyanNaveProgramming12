package com.ryan.module11;

public class TwoDShape {
    private double width;
    private double height;

    public TwoDShape(){
        width = 0;
        height = 0;
    }

    public TwoDShape(double inWidth, double inHeight){
        width = inWidth;
        height = inHeight;
    }

    public double getArea(){
        return (width * height);
    }

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

    public String toString(){
        return ("2D Shape " +
                "- height: " + height
                + " - width: " + width);
    }
}
