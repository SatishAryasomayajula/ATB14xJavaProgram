package SecondHeightNumber;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] number= {12,97,44,56,98,11};
        int highest=0;
        int secondHighest=0;

        for (int num:number){
            if(num>highest) {


                secondHighest = highest;
                highest = num;

            }
        }
        System.out.println("Second Highest number is - " +secondHighest);
        System.out.println("Highest Number is - " +highest);

    }
}
