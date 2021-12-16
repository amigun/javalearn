package com.company;

// Bubble sort

public class Main {

    public static void main(String[] args) {
        int []arr = new int[] {5, 3, 9, 2, 4, 1, 8, 6, 0, 7}; // not sorted array

        System.out.print("Not sorted array: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0, j = 1; i != arr.length - 1 && j != arr.length;) {
            if (arr[i] > arr[j]) {
                // swap
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];

                i = 0; j = 1;
            } else {
                i++; j++;
            }
        }

        System.out.print("\nSorted array: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
