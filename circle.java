/*
Question:
Write a Java program to determine whether a given point lies inside, on, or outside a circle. The program should
take the coordinates of the center of the circle (x1, y1), the coordinates of the point (x2, y2), and the radius of
 the circle as input from the user. Based on this input, determine if the point is inside the circle, on the circle,
 or outside the circle, and print the corresponding message.

Sample Input/Output:
Enter the coordinates of the center of the circle (x1, y1) and radius:
0 0 5
Enter the coordinates of the point (x2, y2):
3 4

Output:
Inside the circle
*/

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int radius = in.nextInt();

        double ans = Math.sqrt(Math.pow(x2,x1)+Math.pow(y2,y1));

        if (ans<radius)
         System.out.println("inside the circle");
        else if(ans==radius)
            System.out.println("On the circle");
        else if(ans>radius)
            System.out.println("Outside the circle");


    }
}


// x,y frogs, x,y