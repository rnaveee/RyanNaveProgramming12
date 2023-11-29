import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner file = new Scanner("happyorsad.txt");

        String text = file.nextLine();
        int happy = 0;
        int sad = 0;

        for(int i = 0; i < text.length()-3; i++){
            if((text.substring(i, i+3)).equals(":-)")){
                happy++;
            }
            if((text.substring(i, i+3)).equals(":-(")){
                sad++;
            }
        }

        if(happy == sad){
            System.out.println("unsure");
        }
        else if(happy > sad){
            System.out.println("happy");
        }
        else if(happy < sad){
            System.out.println("sad");
        }
        else {
            System.out.println("none");
        }


    }
}