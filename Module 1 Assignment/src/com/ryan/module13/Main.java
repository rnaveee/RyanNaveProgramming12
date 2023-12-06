package com.ryan.module13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<TwoDShape> shapes = new ArrayList<>();

        shapes.add(new Triangle(16.3, 18.2));
        shapes.add(new Triangle(20.3, 23.7, 14.2));

        shapes.add(new Circle(4.7));
        shapes.add(new Circle(18.26));

        for(int i = 0; i < shapes.size(); i++){

            System.out.println(shapes.get(i));
            System.out.println("Area: " + shapes.get(i).getArea());
        }
    }


}