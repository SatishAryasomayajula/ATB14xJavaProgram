package CheckNumberIsPositiveOrNegative;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckPossitiveveOrNegative {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter Number");
        int input = scn.nextInt();

        if (input<0) {

            System.out.println("The Entered number " + input + " is Negative Number");
        } else if(input>0){
            System.out.println("The Entered number " + input + " is Positive Number");
        } else {
            System.out.print("Enter numbers only");
        }


    }

}
