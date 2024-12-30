package chapter8;

import java.util.Arrays;

public class BubbleSort {

    // Method to perform bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // To optimize the algorithm

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps occurred during the pass, the array is already sorted
            if (!swapped) break;
        }
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

