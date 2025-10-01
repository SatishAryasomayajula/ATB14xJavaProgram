package FizBuzTest_Program_3;

public class FixBuz {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
        //instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of
        //both 3 and 5, print "FizzBuzz."

        //number= 100, if it is divisible by 3 print Fizz, if the number divisible by 5 print Buzz

        int number= 100;
        for (int i =1; i<=number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(+i +"is divisible by both 3 and 5 FizBuzz");
            }
            if (i % 3 == 0) {
                System.out.println(+i +"is divisible by 3 Fizz");
            } else if (i % 5 == 0) {
                System.out.println(+i +"is divisible by 5 Buzz");
            }
        }

    }
}
