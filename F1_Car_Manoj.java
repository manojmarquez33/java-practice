
/**
Question:
Manoj is innocently observing a Formula One (F1) car race, but due to the influence of extra chemicals, he starts hallucinating an infinite linear path where F1 cars are racing. In this hallucination, every car aims to go at its maximum speed. However, if by chance, the next adjacent car is unable to complete the maximum speed, the car will slow down to the speed of the adjacent car. Manoj wants to count how many cars are going at their maximum speed.

Given the number of cars in the race and the speeds of each car represented as integers in sequence, write a program to determine the number of cars going at maximum speed according to Manoj's hallucination.

Input:
The first line contains an integer 'n' representing the number of cars in the race.
The second line contains 'n' integers separated by space representing the speeds of each car in the race.

Output:
Print the number of cars going at maximum speed.

Sample Input:
5
4 5 1 2 3

Sample Output:
2

Explanation:
In the given input, there are 5 cars in the race with speeds [4, 5, 1, 2, 3]. Out of these, only 2 cars (car 2 and car 3) are going at maximum speed because car 3's speed is less than car 2's speed, causing it to slow down.
*/


import java.util.Scanner;

public class F1_Car_Manoj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),speed,count=1,curr;
        int fs = in.nextInt();
        speed = fs;
        for(int i=1;i<n;i++){
            curr = in.nextInt();
            if(curr< speed){
                count++;
            }
            speed = curr;

        }
        System.out.println(count);
    }
}
