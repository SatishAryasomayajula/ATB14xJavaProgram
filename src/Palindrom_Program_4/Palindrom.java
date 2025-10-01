package Palindrom_Program_4;

public class Palindrom {
    public static void main(String[] args) {



        int num=121;
        int ognumber=num;
        int reverse=0;
        while(ognumber>0){
            int digit = ognumber%10;
            reverse = reverse*10+digit;
            ognumber= ognumber/10;


        }
        System.out.println("The reverse number is "+reverse);
            if (num==reverse) {
                System.out.println("The given number "+num +" is Palindrom");
            }else
                System.out.println("The given number "+num +" is not Palindrom");


    }



}
