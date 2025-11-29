package NestedLoops;

import java.util.Scanner;

public class FloyedTriangles {
    public static void main(String[] args) {

//        floyed Triangle
//                1
//                2 3
//                4 5 6
//                7 8 9 10

        Scanner scn= new Scanner(System.in);
        System.out.println("Please enter number of Rows");
        int n=scn.nextInt();
        int num=1;
        scn.close();

        for (int i=1; i<=n; i++){
            for (int j=1;j<=i;j++) {

                System.out.print("*");
                num = num + 1;
            }System.out.println();

        }




    }
}
