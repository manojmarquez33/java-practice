/**
    Question:
    You are given the coordinates of multiple frogs, their tongue lengths, and the coordinates of insects.
    The goal is to determine, for each frog, how many insects it can catch within its tongue range.
    Write a Java program to achieve this.

    Sample Input:
    Enter number of frog:
    2
    Enter coordinates of frog 1 (x y) and its tongue length:
    0 0 5
    Enter coordinates of frog 2 (x y) and its tongue length:
    5 5 7
    Enter number of insects:
    3
    Enter coordinates of insect 1 (x y):
    1 1
    Enter coordinates of insect 2 (x y):
    6 6
    Enter coordinates of insect 3 (x y):
    2 2

    Sample Output:
    [1, 0]

    Explanation:
    - Frog 1 is at (0, 0) with a tongue length of 5. It can catch 1 insect at (1, 1) within its tongue range.
    - Frog 2 is at (5, 5) with a tongue length of 7. It cannot catch any insects within its tongue range.
*/


import java.util.Arrays;
import java.util.Scanner;

public class Frog_Insects {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Enter  number of frog ");
        int frog = in.nextInt();

        int xf[] = new int[frog];
        int yf[] = new int[frog];
        int tongue[] = new int[frog];
        for (int i=0;i<frog;i++) {
            xf[i] = in.nextInt();
            yf[i] = in.nextInt();
            tongue[i]=in.nextInt();
        }

        int insects = in.nextInt();
        int xi[] = new int[insects];
        int yi[] = new int[insects];
        for (int i=0;i<insects;i++) {
            xi[i] = in.nextInt();
            yi[i] = in.nextInt();
        }

        int count[] = new int[frog];
        for (int i=0;i<frog;i++) {
            for (int j=0;j<insects;j++){
            double distance = Math.sqrt(Math.pow((xf[i]-xi[i]),2)+Math.pow((yf[i]-yi[i]),2));
            if(distance<=tongue[i]) {
                count[i]++;
            }
            }
        }

        System.out.println(Arrays.toString(count));
    }
}
