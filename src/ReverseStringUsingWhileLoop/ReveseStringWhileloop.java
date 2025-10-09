package ReverseStringUsingWhileLoop;

public class ReveseStringWhileloop {
    public static void main(String[] args) {
//        String str="satyam";
//
//        //reverse string with out using functions.
//        String revstr="";
//        for (int i=str.length()-1; i>=0; i--){
//            revstr=revstr+str.charAt(i);
//
//        }
//        System.out.println(revstr);

        //using while loop reverse the string
        String str1= "Vimala";
        String revstr1="";
        int i=str1.length()-1;
        while(i>=0){
            revstr1= revstr1+str1.charAt(i);
            i--;

        }
        System.out.println(revstr1);




    }
}
