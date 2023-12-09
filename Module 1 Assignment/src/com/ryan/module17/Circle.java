package com.ryan.module17;

public class Circle extends TwoDShape {
    private final double pi = Math.PI;
    private double radius;

    /**
     * Default constructor for circle
     * creates a blank circle
     */
    public Circle(){
        super(Colour.NONE);
        radius = 0;
    }

    /**
     * Constructs a circle object
     * @param radius determines the radius of the circle
     * @param inColour determines the colour of the circle
     */
    public Circle(double radius, Colour inColour){
        super(inColour);
        this.radius = radius;
    }

    /**
     * Determines the area of the circle
     * @return the area of the circle using pi*r^2
     */
    public double getArea(){
        return (pi * (radius * radius));
    }


    /**
     * Gives information on circle object
     * @return string of information on the circle object
     */
    public String toString() {
        return "Circle - radius: " + radius
                + " - Colour: " + getColour();
    }

    /**
     * references the radius of the circle
     * @return the radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Sets a new radius to the circle
     * @param newRadius the new radius set for the circle
     */
    public void setRadius(double newRadius){
        radius = newRadius;
    }


}
