// given the x,y cooordinates of a center point of a circle, along with this radius.
// now find whether x or y, given by the user, lies inside the circle, on the circle,
// or outside the circle

import java.util.Scanner;

public class Frog_Insects {
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
