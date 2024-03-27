// given the x,y cooordinates of a center point of a circle, along with this radius.
// now find whether x or y, given by the user, lies inside the circle, on the circle,
// or outside the circle

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
