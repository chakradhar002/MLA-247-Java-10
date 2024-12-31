package chapter9;
import java.util.Arrays;

public class SelectionSort {
    // Method to perform selection sort
    public  void selectionSort(int[] myarray) {
        int n = myarray.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the first element of the unsorted part is the smallest
            int smallnumber = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (myarray[j] < myarray[smallnumber]) {
                	smallnumber = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            if (smallnumber != i) {
                int temp = myarray[smallnumber];
                myarray[smallnumber] = myarray[i];
                myarray[i] = temp;
            }

            // Debug: Print the array after each iteration
            System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(myarray));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {32,5,33,89,1};
        SelectionSort r = new SelectionSort();
        System.out.println("Original array: " + Arrays.toString(numbers));
        r.selectionSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
