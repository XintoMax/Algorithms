package org.horizoncolumbus.hs;

// 2/12/2021
public class FridayHW {

    //How many nano-seconds are in a second
    private static final double nanoPerSecond = 1_000_000_000;

    // Define a constant array size integer
    private static final int ARRAYSIZE = 1_000_000_000;

    //specify minimum and maximum values for Random() generator
    private static final int MIN = 0;
    private static final int MAX = 999;

    //Declare an array with constant size: ARRAYSIZE
    static int[] array = new int[ARRAYSIZE];

    public static void main(String[] args) {

        System.out.println("doing the thing...");

        //Fill the array with some random numbers
        fillTheArray();

        //start time
        long startTime = System.nanoTime();

        int minValue = findMinValue();

        //end time
        long endTime = System.nanoTime();

        //duration
        long duration = (endTime - startTime);


        // Display code results
        System.out.println("Result 1: \t" + minValue);
        System.out.println("Result 2: \t" + duration / nanoPerSecond);
    }

    public static void fillTheArray() {
        for (int arrayIndex = 0; arrayIndex < ARRAYSIZE; arrayIndex++) {
            array[arrayIndex] = generateRandomNumber();
        }
    }

    public static int findMinValue() {
        int min = array[0];
        for (int arrayIndex = 0; arrayIndex < ARRAYSIZE; arrayIndex++) {
            if (array[arrayIndex] < min)
                min = array[arrayIndex];
        }
        return min;
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * (MAX - MIN + 1) + MIN);
    }
}

