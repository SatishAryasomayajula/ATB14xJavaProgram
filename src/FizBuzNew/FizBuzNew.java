package FizBuzNew;

import java.sql.SQLOutput;

public class FizBuzNew {
    // take a number from 1 to 100
    // if the number is divisible by 3 then print Fizz
    //if the number is divisible by 5 then print Buzz
    //if the number is divisible by 3 and 5 then print FizzBuzz
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + "is divisible by 3 and 5 hence it is FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Number " + i + "is divisible by 3 hence it is Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Number " + i + "is divisible by 5 hence it is Buzz");

            }
        }

    }




}
