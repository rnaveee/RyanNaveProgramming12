package com.ryan.module17;

public interface Rotate {

    /**
     * should add 90 degrees to the rotation of triangle
     */
    void rotate90();
    /**
     * should add 180 degrees to the rotation of triangle
     */
    void rotate180();

    /**
     * Rotates the triangle in a chosen degree
     * @param degree the degree for the triangle to rotate
     */
    void rotate(double degree);
}
