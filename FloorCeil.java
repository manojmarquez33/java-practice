/**
Question:
Write a Java program to find the floor and ceiling of a given floating-point number. The floor of a number is the largest integer less than or equal to the number, while the ceiling is the smallest integer greater than or equal to the number. Implement a program that takes a floating-point number as input and prints its floor and ceiling.

Sample Input/Output:
Given floating-point number: 15.2

Floor:
15
Ceil is:
16

Explanation:
For the given floating-point number 15.2, the floor is 15 and the ceiling is 16.
*/

public class FloorCeil {
    public static void main(String[] args) {

        float e = 15.2f;
        System.out.println("Floor :");
        System.out.println(((int)e+1)-1);
        System.out.println("Ceil is :");
        System.out.println(e-(int)e == 0 ? ((int)e) : (int)e+1);
 
    }
}