/*
Question:
Write a Java program to reverse a number without using loops. Implement a recursive function to achieve this task.

Sample Output:
Input:
123456
Output:
654321
*/

public class Reverse_number {
    static int a = 123456;

    public static void main(String[] args) {

        reverse(a);
    }
    public static void reverse(int a){
        if(a>0) {
            System.out.print(a%10);
            reverse(a/10);

        }
    }
}
