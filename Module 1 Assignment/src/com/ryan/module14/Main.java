package com.ryan.module14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("All shapes");

        ArrayList<TwoDShape> shapes = new ArrayList<>();

        shapes.add(new Triangle(16.3, 18.2, Colour.BLUE));
        shapes.add(new Triangle(20.3, 23.7, 14.2, Colour.RED));
        shapes.add(new Triangle(16.3, 18.2, Colour.GREEN));
        shapes.add(new Triangle(16.3, 18.2, 31.2, Colour.NONE));

        shapes.add(new Circle(4.7, Colour.GREEN));
        shapes.add(new Circle(18.26, Colour.BLUE));
        shapes.add(new Circle(4.7, Colour.RED));
        shapes.add(new Circle(18.26, Colour.NONE));

        for(int i = 0; i < shapes.size(); i++){

            System.out.println(shapes.get(i));
            System.out.println("Area: " + shapes.get(i).getArea());
            System.out.println("");




        }

        ArrayList<Triangle> triangles = new ArrayList<>();

        triangles.add(new Triangle(12.3, 13.2, Colour.BLUE));
        triangles.add(new Triangle(24.3, 25.7, 18.2, Colour.RED));
        triangles.add(new Triangle(16.3, 17.2, Colour.GREEN));
        triangles.add(new Triangle(12.3, 11.2, 10.2, Colour.NONE));

        System.out.println("" + "\n" + "Triangles" + "\n" + "");



        for(int i = 0; i < 4; i++){

            triangles.get(i).rotate(192);



            System.out.println(triangles.get(i));
            System.out.println("Area: " + triangles.get(i).getArea());





        }
    }


}