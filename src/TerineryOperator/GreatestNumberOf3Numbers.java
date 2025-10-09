package TerineryOperator;



public class GreatestNumberOf3Numbers {

    public static void main(String[] args) {


//    //terinary operator
//    int a=1;
//    int b=0;
//    int c=-1;
//
//    String result=  (a>b ? (a>c ? "a":"c"):(b>c ? "b":"c"));
//    System.out.println("Greatest among a,b and c - "+result);
     int a=9;
     int b=6;
     int c=10;

     if (a>b && a>c){
         System.out.println("A is greatest number");
     }else if(b>a && b>c){
            System.out.println("B is greatest number");
        }else if(c>a && c>b){
         System.out.println("C is greatest number");

     }



            }
}

//a>b ? (a>c ? "a":"b") : (b>c ? "b":"c")


