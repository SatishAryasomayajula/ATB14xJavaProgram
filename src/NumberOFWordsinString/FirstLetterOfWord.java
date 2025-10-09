package NumberOFWordsinString;

import java.util.Scanner;

public class FirstLetterOfWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String input= sc.nextLine();
        String[] s= input.split(" ");
        System.out.println("The length of input string is =" +s.length);


        for (int i = 0; i < s.length; i++) {
            System.out.println("first letter of each word is:"+s[i].charAt(0));


        }


    }
}
