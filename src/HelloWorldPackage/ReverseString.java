package HelloWorldPackage;
import java.lang.String;

public class ReverseString {
    public static void main(String [] args){

        /* reverse a string */

        String s = "Satish";
        String rev ="";
        char ch;
        System.out.println("Hello auto build1");

        for ( int i=0; i<s.length(); i++){

            ch =s.charAt(i);
            rev = ch+rev;



        }
        System.out.println(rev);
    }

}
