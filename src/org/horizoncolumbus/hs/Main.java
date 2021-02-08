package org.horizoncolumbus.hs;

// 2/8/2021
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {2,3,7,5,4,8,0,2,6};
        int largestInt = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > largestInt) {
                largestInt = a[i];
            }

        }
        System.out.println(largestInt);

    }
}
