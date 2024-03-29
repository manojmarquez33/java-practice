/**
Question:
Write a Java program that implements Kadane's algorithm to find the maximum subarray sum. The program should take input from the user for the total number of elements in the array and the elements of the array. Then, it should compute and output the maximum sum of contiguous subarray elements.

Sample Input/Output:
Input:
Enter the total number of elements: 8
Enter the elements of the array:
-2 1 -3 4 -1 2 1 -5

Output:
6

Explanation:
The input array is {-2, 1, -3, 4, -1, 2, 1, -5}. The contiguous subarray with the maximum sum is {4, -1, 2, 1}, and its sum is 6.
*/

import java.util.*;
public class KadanesAlgo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE,sum=0;
        int tot=sc.nextInt();
        int[] n=new int[tot];
        for(int j=0;j<n.length;j++){
            n[j]=sc.nextInt();
        }

        for(int i:n){
            sum=sum+i;
            if(max<sum){
                max=sum;
            }if(sum<0){
                sum=0;
            }
        }
        System.out.print(max);
    }
}