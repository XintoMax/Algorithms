package org.horizoncolumbus.hs;

//3/1/2021
public class Sum {

    public static void main(String[] args) {
        int[] arr = {3, 66, 3, 6, 8, 2, 7};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
