package org.horizoncolumbus.hs;

import java.util.Scanner;

//3/1/2021
public class CountingMatches {

    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 7, 8, 3, 7};
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Which number are you looking for? ");
        int n = scan.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                counter++;
            }
        }
        System.out.println(n + " shows up " + counter + " times in this array.");
    }
}
