package org.horizoncolumbus.hs;

import java.util.Arrays;

//3/1/2021
public class Swap {

    public static void main(String[] args) {

        int x = 9;
        int y = 5;

        int z = x;
        x = y;
        y = z;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //Homework
        int[] arr = {3,2};
        for (int i = 0; i < 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Swapped array: ");
        for (int i=0; i < arr.length; ++i) {
            if(i == 1) {
                System.out.println(arr[i] + "}");
            }
            else
            System.out.print("{" + arr[i] + ",");
        }
    }
}
