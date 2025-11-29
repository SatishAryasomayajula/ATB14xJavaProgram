package CheckTwoArraysAreEqual;

import java.util.Arrays;

public class CheckTwoArraysEqual {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5,6,7,8,9};
//        int[] b={1,2,3,4,5,6,7,8,9};
//        int[] c={1,2,3,4,5,6,7,9,9};
//        System.out.println(Arrays.equals(a,b));
//        System.out.println(Arrays.equals(a,c));


        int[][] i={{10,12},{20,30}};
        int[][] j={{10,12},{20,30}};
        int[][] k={{10,12},{20,31}};

        System.out.println(Arrays.deepEquals(i,j));
        System.out.println(Arrays.deepEquals(i,k));
    }
}
