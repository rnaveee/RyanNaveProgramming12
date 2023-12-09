package com.ryan.module17.tests;

import com.ryan.module17.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    //partition
    /*

    3 given sides
    given width and height

     */

    @Test public void threeSidesArea(){
        /*
        12.1, 15.4, 23.2 = area

        s = ((12.1 + 15.4 + 23.2)/2)
        area = sqrt((s * (s - 12.1) * (s - 15.4) * (s - 23.2))
         */

        /*
        82.3. 72.1, 100.2 = area

        s = ((82.3 + 72.1 + 100.2)/2)
        area = sqrt((s * (s - 82.3) * (s - 72.1) * (s - 100.2))
         */



        /*
        50.2, 34.8, 69.7 = area

        s = (( 50.1 + 34.8 + 69.7 ) /2 )
        area = sqrt( (s * (s - 50.1) * (s - 34.8) * (s - 69.7) )
         */

        Triangle t = new Triangle(12.1, 15.4, 23.2, Colour.RED);
        assertEquals(Math.sqrt( ((( 12.1 + 15.4 + 23.2 ) /2 ) *
                ((( 12.1 + 15.4 + 23.2 ) /2 ) - 12.1) *
                ((( 12.1 + 15.4 + 23.2 ) /2 ) - 15.4) *
                ((( 12.1 + 15.4 + 23.2 ) /2 ) - 23.2) )),
                t.getArea(), 0.002);

        Triangle k = new Triangle(82.3, 72.1, 100.2, Colour.RED);
        assertEquals(Math.sqrt( ((( 82.3 + 72.1 + 100.2 ) /2 ) *
                ((( 82.3 + 72.1 + 100.2 ) /2 ) - 82.3) *
                ((( 82.3 + 72.1 + 100.2 ) /2 ) - 72.1) *
                ((( 82.3 + 72.1 + 100.2 ) /2 ) - 100.2) )),
                k.getArea(), 0.002);

        Triangle s = new Triangle(50.1, 34.8, 69.7, Colour.RED);
        assertEquals(Math.sqrt( ((( 50.1 + 34.8 + 69.7 ) /2 ) *
                ((( 50.1 + 34.8 + 69.7 ) /2 ) - 50.1) *
                ((( 50.1 + 34.8 + 69.7 ) /2 ) - 34.8) *
                ((( 50.1 + 34.8 + 69.7 ) /2 ) - 69.7) )),
                s.getArea(), 0.002);



    }

    @Test public void widthAndHeightArea(){
        /*
        4.8, 7.98 = area

        (4.8 * 7.98) / 2 = area
         */

        /*
        78.356, 42.37 = area

        (78.356 * 42.37) / 2 = area
         */

        /*
        1.1, 6.9 = area

        (1.1 * 6.9) / 2 = area
         */

        assertEquals((4.8 * 7.98) / 2, (new Triangle(4.8, 7.98, Colour.NONE).getArea()), 0.002);

        assertEquals((78.356 * 42.37) / 2, (new Triangle(78.356, 42.37, Colour.NONE).getArea()), 0.002);

        assertEquals((1.1 * 6.9) / 2, (new Triangle(1.1, 6.9, Colour.NONE).getArea()), 0.002);




    }

    @Test public void widthAndHeightHeronsHeight(){
        /*
        4.8, 7.98 = area

        (4.8 * 7.98) / 2 = area
         */

        /*
        78.356, 42.37 = area

        (78.356 * 42.37) / 2 = area
         */

        /*
        1.1, 6.9 = area

        (1.1 * 6.9) / 2 = area
         */

        assertEquals(7.98, (new Triangle(4.8, 7.98, Colour.NONE).heronsHeight()), 0.00001);

        assertEquals(42.37, (new Triangle(78.356, 42.37, Colour.NONE).heronsHeight()), 0.00001);

        assertEquals(6.9, (new Triangle(1.1, 6.9, Colour.NONE).heronsHeight()), 0.00001);




    }

    @Test public void threeSidesHeronsHeight(){
        /*
        12.1, 15.4, 23.2 -> height of triangle

        s = ((12.1 + 15.4 + 23.2)/2)
        area = (sqrt(s * (s - 12.1) * (s - 15.4) * (s - 23.2)))
        height = ((area * 2) / 15.4)
         */

        /*
        82.3. 72.1, 100.2 -> height of triangle

        s = ((82.3 + 72.1 + 100.2)/2)
        area = sqrt((s * (s - 82.3) * (s - 72.1) * (s - 100.2))
        height = (area * 2) / 72.1
         */



        /*
        50.2, 34.8, 69.7 -> height of triangle

        s = (( 50.1 + 34.8 + 69.7 ) /2 )
        area = sqrt( (s * (s - 50.1) * (s - 34.8) * (s - 69.7) )
        height = (area * 2) / 34.8
         */

        Triangle t = new Triangle(12.1, 15.4, 23.2, Colour.RED);
        assertEquals((((Math.sqrt(((12.1 + 15.4 + 23.2)/2) *
                (((12.1 + 15.4 + 23.2)/2) - 12.1) *
                (((12.1 + 15.4 + 23.2)/2) - 15.4) *
                (((12.1 + 15.4 + 23.2)/2) - 23.2))) * 2) / 15.4), t.heronsHeight(), 0.5);

        Triangle k = new Triangle(82.3, 72.1, 100.2, Colour.RED);
        assertEquals((((Math.sqrt(((82.3 + 72.1 + 100.2)/2) *
                (((82.3 + 72.1 + 100.2)/2) - 82.3) *
                (((82.3 + 72.1 + 100.2)/2) - 72.1) *
                (((82.3 + 72.1 + 100.2)/2) - 100.2))) * 2) / 72.1), k.heronsHeight(), 0.5);


        Triangle s = new Triangle(50.1, 34.8, 69.7, Colour.RED);
        assertEquals((((Math.sqrt(((50.1 + 34.8 + 69.2)/2) *
                (((50.1 + 34.8 + 69.2)/2) - 50.1) *
                (((50.1 + 34.8 + 69.2)/2) - 34.8) *
                (((50.1 + 34.8 + 69.2)/2) - 69.2))) * 2) / 34.8), s.heronsHeight(), 0.5);



    }







}