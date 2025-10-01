package Scanner_program_1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scn.nextLine();
        System.out.println("Enter your age");
        int age = scn.nextInt();
        System.out.println("Hello  " +name +"  how are you. Your age is "+age +" is that right ?");


    }
}
