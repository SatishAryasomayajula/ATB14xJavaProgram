package JavaMagicNumber;

public class JavaMagicNumberUsingFor {
    public static void main(String[] args) {

        // Java magic number using for loop
        // how many number of magic numbers are present in a given range of numbers
        // say from 1 to 2000 how many java magic numbers are there and what are they.

        int number=2000;
        for (int i=1; i<=number; i++)
        {
            if(i==1) {
                System.out.println(+i + " is Magic Number");

                if (i > 9) {
                    int sum = 0;
                    if (i != 0) {
                        sum = sum + i % 10;
                        i = i / 10;

                    }

                }

            }System.out.println(i);
        }

    }
}
