/*
Question:
Write a Java program to perform array rotation. The program should rotate an array to the right and to the left by a
specified number of times. Initialize an array with elements {1, 2, 3, 4, 5} and rotate it to the right and left by
4 times each. Print the resulting arrays after rotation.

Sample Input/Output:
Initial Array: [1, 2, 3, 4, 5]
Number of rotations: 4
-----------Right rotation-----------
2 3 4 5 1
-----------Left rotation------------
5 1 2 3 4

Explanation:
For the initial array [1, 2, 3, 4, 5], right rotation by 4 times results in [2, 3, 4, 5, 1].
Left rotation by 4 times results in [5, 1, 2, 3, 4].
*/

import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int time=4;
        int b[] = {1,2,3,4,5};
        Rightrotate(a,time);
        Leftrotate(b,time);
        System.out.println("-----------Right rotation-----------");
        for (int c:a){
            System.out.print(c+" ");
        }
        System.out.println("\n-----------Left rotation------------");
        for (int c:b){
            System.out.print(c+" ");
        }
    }
    public static void Rightrotate(int a[],int time){
        int l = a.length;
        for(int i=0;i<time;i++){
            int temp = a[l-1];
            for (int j=l-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
    }public static void Leftrotate(int b[],int time){
        int l = b.length;
        for(int i=0;i<time;i++){
            int temp = b[0];
            for (int j=0;j<l-1;j++){
                b[j] = b[j+1];
            }
            b[l-1] = temp;
        }
    }
}
