package com.company;

// Max, min and average values of array

public class Main {

    public static void main(String[] args) {
        int []arr = new int[10];

        // filling the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        int max_value = arr[0], min_value = arr[0];
        float average_value = 0;

        for (int i : arr) {
            if (i > max_value) {
                max_value = i;
            }

            if (i < min_value) {
                min_value = i;
            }

            average_value += i;
        }

        average_value /= arr.length;

        System.out.print("Array:");
        for (int i : arr) {
            System.out.print(" " + i);
        }

        System.out.println("\nMax value: " + max_value);
        System.out.println("Min value: " + min_value);
        System.out.println("Average value: " + average_value);
    }
}
