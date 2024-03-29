/*
Question:
Write a Java program to rotate an array to the right by a specified number of positions without using any built-in rotation functions. Implement a method that takes an integer array and the number of rotations as input and performs the rotations in-place.

Sample Input/Output:
Original Array:
1 2 3 4 5
Array after 2 right rotations:
4 5 1 2 3
*/

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2; // Number of rotations

        System.out.println("Original Array:");
        printArray(array);

        rightRotate(array, n);

        System.out.println("Array after " + n + " right rotations:");
        printArray(array);
    }
    public static void rightRotate(int[] arr, int n) {
        if (arr == null || arr.length == 0)
            return;

        int length = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[length - 1];
            for (int j = length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
