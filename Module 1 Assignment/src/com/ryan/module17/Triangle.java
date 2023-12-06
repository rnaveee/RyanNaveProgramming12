package com.ryan.module17;

public class Triangle extends TwoDShape implements Rotate {

    //attributes
    private int rotation = 0;
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    //default constructor
    public Triangle(){
        super(Colour.NONE);
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    //height and width constructor
    public Triangle(double inWidth, double inHeight, Colour inColour){
        super(inHeight, inWidth, inColour);

    }

    //3 sides constructor
    public Triangle(double inSide1, double inSide2, double inSide3, Colour inColour){
        super(inColour);
        side1 = inSide1;
        side2 = inSide2;
        side3 = inSide3;
    }

    //getArea method
    public double getArea(){
        if(super.getHeight() != 0.0 && super.getWidth() != 0.0){
            return ((super.getHeight() * super.getWidth()) / 2);
        } else {
            double s = ((side1 + side2 + side3)/2);
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            return area;
        }

    }

    //heron height method
    public double heronsHeight(){
        //checks if there are 3 sides
        if(side1 + side2 + side3 > 0.0){
            double s = ((side1 + side2 + side3)/2);
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            // this assumes that side2 is the base
            double heronsHeight = (area * 2)/side2;
            this.setHeight(heronsHeight);
            return heronsHeight;
        }
        //returns the height of triangle
        else {
            return super.getHeight();
        }
    }


    //getters and setters
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

    //toString method
    public String toString(){

        return "Triangle - first side: " + side1
                + " - second side: " + side3
                + " - base : " + side2
                + " - height: " + heronsHeight()
                + " - width: " + super.getWidth()
                + " - colour: " + getColour()
                + " - rotated " + rotation + " degrees from origin";
    }


    //rotation methods
    //adds degrees to its rotation
    public void rotate90() {
        rotation += 90;
        while(rotation > 360){
            rotation -= 360;
        }

    }


    public void rotate180() {
        rotation += 180;
        while(rotation > 360){
            rotation -= 360;
        }
    }


    public void rotate(double degree) {
        rotation += degree;
        while(rotation > 360){
            rotation -= 360;
        }
    }
}
