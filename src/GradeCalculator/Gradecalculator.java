package GradeCalculator;

import java.util.Scanner;

public class Gradecalculator {

    public static void main(String[] args) {

        // Grade calculator
        //90-100 = Grade A
        //80-89 = Grade B
        //70-79 = Grade C
        //60-69 = Grade D
        //50-59 = Grade F

        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter number to find out the grade");

        int i = scn.nextInt();


        if (i >= 90 && i <= 100) {
            System.out.println("Grade A");
        }

        if (i >= 80 && i <= 89) {
            System.out.println("Grade B");
        }

        if (i >= 70 && i <= 79) {
            System.out.println("Grade C");
        }

        if (i >= 60 && i <= 69) {
            System.out.println("Grade D");
        }
        if (i >= 50 && i <= 59) {
            System.out.println("Failed");
        }


    }
}
