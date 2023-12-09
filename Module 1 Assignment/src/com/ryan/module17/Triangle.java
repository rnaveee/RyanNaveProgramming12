package com.ryan.module17;

public class Triangle extends TwoDShape implements Rotate {


    private int rotation = 0;
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    /**
     * Default constructor for triangle object
     * Constructs a triangle with no sides, height, width, and colour
     */
    public Triangle(){
        super(Colour.NONE);
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    /**
     * Triangle constructor
     * Constructs a triangle with equal sides
     * @param inWidth determines the width of the triangle
     * @param inHeight determines the height of the triangle
     * @param inColour determines the colour of the triangle
     */
    public Triangle(double inWidth, double inHeight, Colour inColour){
        super(inHeight, inWidth, inColour);

    }

    /**
     * Second Triangle constructor
     * Constructs a triangle with different sides
     * @param inSide1 determines the first side
     *                by default the leftmost side of the triangle
     * @param inSide2 determines the second side
     *                by default the base/bottommost side of the triangle
     * @param inSide3 determines the third side
     *                by default the rightmost side
     * @param colour determines the colour of the triangle
     */
    public Triangle(double inSide1, double inSide2, double inSide3, Colour colour){
        super(colour);
        side1 = inSide1;
        side2 = inSide2;
        side3 = inSide3;
    }

    /**
     * Area of a triangle
     * calculates the area of the triangle either using Heron's formula or (B*H)/2
     * @return area of the triangle
     */
    public double getArea(){
        if(super.getHeight() != 0.0 && super.getWidth() != 0.0){ //checks if the triangle is of equal sides
            return ((super.getHeight() * super.getWidth()) / 2); // will return (base*height)/2 for area of the triangle
        } else { // calculates the area using Heron's Formula
            double s = ((side1 + side2 + side3)/2);
            return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
        }

    }

    /**
     * Height of the triangle using Heron's formula
     * calculates the height of the triangle by using Heron's formula
     *              will add all sides and divide by 2
     *              using sqrt((s * (s - side1) * (s - side2) * (s - side3)) will give area
     *              multiplies the area by 2 then divides by the base - we assume is side2
     * @return height of the triangle
     */
    public double heronsHeight(){
        //checks if there are 3 sides
        if(side1 + side2 + side3 > 0.0){
            double s = ((side1 + side2 + side3)/2); //calculates s value
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))); // calculates area using s value
            // this assumes that side2 is the base
            double heronsHeight = (area * 2)/side2; // calculates height
            this.setHeight(heronsHeight); //sets the height of triangle to herons height
            return heronsHeight;
        }
        //returns the height of triangle
        else {
            return super.getHeight(); //will return the height if triangle has equal sides
        }
    }

    /**
     * Getter for rotation
     * @return rotation of the triangle from its origin
     */
    public double getRotation(){
        return rotation;
    }

    /**
     * Getter for side1
     * @return 1st side of triangle
     */
    public double getSide1(){
        return side1;
    }

    /**
     * Getter for side2
     * @return 2nd side of triangle
     */
    public double getSide2(){
        return side2;
    }

    /**
     * Getter for side3
     * @return 3rd side of triangle
     */
    public double getSide3(){
        return side3;
    }

    /**
     * Setter for side1
     * sets a new side for 1st side of the triangle
     * @param newSide new side value for the 1st side to be set
     */
    public void setSide1(double newSide){
        side1 = newSide;
    }

    /**
     * Setter for side2
     * sets a new side for 2nd side of the triangle
     * @param newSide new side value for the 2nd side to be set
     */
    public void setSide2(double newSide){
        side2 = newSide;
    }

    /**
     * Setter for side3
     * sets a new side for 3rd side of the triangle
     * @param newSide new side value for the 3rd side to be set
     */
    public void setSide3(double newSide){
        side3 = newSide;
    }

    /**
     * Gives information on triangle object
     * @return string of information on the triangle object
     */
    public String toString(){

        return "Triangle - first side: " + side1
                + " - second side: " + side3
                + " - base : " + side2
                + " - height: " + heronsHeight()
                + " - width: " + super.getWidth()
                + " - colour: " + getColour()
                + " - rotated " + rotation + " degrees from origin";
    }


    /**
     * Rotates triangle 90 degrees
     * adds 90 degrees to the rotation of the triangle
     *          if the triangle's rotation is over 360, will keep subtracting 360
     */
    public void rotate90() {
        rotation += 90;
        while(rotation > 360){
            rotation -= 360;
        }

    }

    /**
     * Rotates triangle 180 degrees
     * adds 180 degrees to the rotation of the triangle
     *          if the triangle's rotation is over 360, will keep subtracting 360
     */
    public void rotate180() {
        rotation += 180;
        while(rotation > 360){
            rotation -= 360;
        }
    }

    /**
     * Rotates triangle a chosen degree
     * adds the chosen degree to the rotation of the triangle
     *          if the triangle's rotation is over 360, will keep subtracting 360
     * @param degree the degree for the triangle to rotate
     */
    public void rotate(double degree) {
        rotation += degree;
        while(rotation > 360){
            rotation -= 360;
        }
    }
}
