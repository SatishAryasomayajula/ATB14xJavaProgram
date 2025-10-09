package NumberOFWordsinString;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WordsInString {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String input= sc.nextLine();
        String[] s= input.split(" ");
        System.out.println("The length of input string is =" +s.length);



    }
}
