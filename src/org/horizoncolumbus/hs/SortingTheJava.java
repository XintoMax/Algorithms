package org.horizoncolumbus.hs;

public class SortingTheJava {
    public static void main(String[] args) {
        int[] unsortedArray = {7,22,3,-5,91,-3,0,6,14};
        int n = unsortedArray.length;
        System.out.println("Unsorted");
        for(int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (unsortedArray[j] > unsortedArray[j+1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted");
            for (int i=0; i<n; ++i) {
                System.out.print(unsortedArray[i] + "\t");
            }
            System.out.println();
    }
}
