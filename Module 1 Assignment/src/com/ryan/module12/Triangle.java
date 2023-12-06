package com.ryan.module12;

public class Triangle extends TwoDShape {
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    public Triangle(){
        super();
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public Triangle(double inWidth, double inHeight){
        super(inHeight, inWidth);
    }

    public Triangle(double inSide1, double inSide2, double inSide3){
        side1 = inSide1;
        side2 = inSide2;
        side3 = inSide3;
    }

    public double getHeight() {
        if(super.getHeight() != 0.0){
            return super.getHeight();
        }
        return heronsHeight();
    }

    public double getArea(){
        if(super.getHeight() != 0.0 && super.getWidth() != 0.0){
            return ((super.getHeight() * super.getWidth()) / 2);
        } else {
            double s = ((side1 + side2 + side3)/2);
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            return area;
        }
    }
    public double heronsHeight(){
        if(side1 + side2 + side3 > 0.0){
            double s = ((side1 + side2 + side3)/2);
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            // this assumes that side2 is the base
            double heronsHeight = (area * 2)/side2;
            this.setHeight(heronsHeight);
            return heronsHeight;
        }
        else {
            return super.getHeight();
        }
    }


    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    public void setSide1(double newSide){
        side1 = newSide;
    }

    public void setSide2(double newSide){
        side2 = newSide;
    }
    public void setSide3(double newSide){
        side3 = newSide;
    }

    public String toString(){

        return "Triangle - first side: " + side1
                + " - second side: " + side3
                + " - base : " + side2
                + " - height: " + heronsHeight()
                + " - width: " + super.getWidth();
    }








}
