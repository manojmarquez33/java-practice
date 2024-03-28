/**
Question:
Children named Aswin and Manoj love candies and eat them continuously. Aswin starts eating candies, eating one
candy at a time, and Manoj eats two candies. Aswin then eats three candies, and Manoj eats four candies, and so on.
Given the total number of candies Aswin (A) and Manoj (B) can eat, determine who will finish their candies first.

Input:
The input consists of multiple lines, each containing two integers A and B (1 <= A, B <= 10^9), representing the
total number of candies Aswin and Manoj can eat, respectively.

Output:
Print the name of the child who will finish eating candies first.

Sample Input/Output:
Input:
3 2
Manoj wins
4 2
Aswin wins
1 1
Aswin wins
1 2
Manoj wins


Explanation:
For the first input (3 2), Manoj eats candies faster than Aswin and finishes first.
For the second input (4 2), Aswin finishes eating candies before Manoj.
For the third input (1 1), both Aswin and Manoj eat candies at the same pace, but Aswin starts first, so Aswin finishes first.
For the fourth input (1 2), Manoj eats candies faster than Aswin and finishes first.
*/

import java.util.Scanner;

public class CandyMano {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        int aswin =0,mano=0,step=1;
        while (true){
            aswin+=step;
            if(aswin>a){
                System.out.println("Manoj wins");
                break;
            }
            step++;
            mano+=step;
            if (mano > m) {
                System.out.println("Aswin wins");
                break;
            }
            step++;
            }
        }
    }

