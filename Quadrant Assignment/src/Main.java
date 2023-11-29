import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("X coordinate: ");
        int x = input.nextInt();

        System.out.println("Y coordinate: ");
        int y = input.nextInt();

        int quadrant = 0;

        if(x > 0 && y > 0){
            quadrant = 1;
        } else if(x < 0 && y > 0){
            quadrant = 2;
        } else if(x < 0 && y < 0){
            quadrant = 3;
        } else if(x > 0 && y < 0){
            quadrant = 4;
        }

        if(quadrant > 0){
            System.out.println("Point (" + x  + "," + y + ") lies on quadrant: " + quadrant);
        } else {
            System.out.println("Point (" + x  + "," + y + ") lies on no quadrant");
        }
    }
}