package com.ryan.module16;

public abstract class TwoDShape {
    private Colour colour;
    private double height;
    private double width;

    /**
     * Default constructor for 2D shapes
     * constructs a blank 2D shape
     * sets width and height of shape to 0
     * @param colour colour of 2D shape - would be none set by child classes
     */
    public TwoDShape(Colour colour){
        this.colour = colour;
        height = 0;
        width = 0;
    }

    /**
     * Constructor for 2D shapes
     * constructs a 2D shape object
     * @param height determines height of the object
     * @param width determines width of the object
     * @param colour determines colour of the object
     */
    public TwoDShape(double height, double width, Colour colour){
        this.colour = colour;
        this.height = height;
        this.width = width;
    }

    /**
     * Abstract method of getting area of 2D shape
     * @return 2D shape's object calculated from shape
     */
    public abstract double getArea();

    /**
     * Abstract method of referencing object
     * @return string of objects information
     */
    public abstract String toString();

    /**
     * Setter for height of 2D shape
     * sets the height of the 2D shape to given value
     * @param newHeight new height of the 2D shape to be set
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    /**
     * Setter for width of 2D shape
     * sets the width of the 2D shape to given value
     * @param newWidth new width of the 2D shape to be set
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * Getter for height of 2D shape
     * references the 2D shape height
     * @return height of 2D shape
     */
    public double getHeight(){
        return height;
    }

    /**
     * Getter for width of 2D shape
     * references the 2D shape width
     * @return width of 2D shape
     */
    public double getWidth(){
        return width;
    }

    /**
     * Getter for colour of 2D shape
     * references the 2D shape colour
     * @return colour of 2D shape
     */
    public Colour getColour(){
        return colour;
    }


}
