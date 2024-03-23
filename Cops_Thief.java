/**
 * There are 100 houses in a lane, numbered from 1 to 100. N cops are positioned in some
 * houses. A cop’s running speed is h houses per second and he can run for at max t secs.
 * Find number of houses where a thief can hide such that he won’t be caught by any of the
 * cops.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Cops_Thief {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // m  - no.cops , x = house/min, y = max min
        int m = in.nextInt(),x=in.nextInt(),y=in.nextInt();
        int r[] = new int[m];
        for (int i=0;i<m;i++)
            r[i] = in.nextInt();

        int house[] = new int[100];
        int tot =  x*y; // total step;
        for(int i=0;i<m;i++) {
            int low = Math.max(0,r[i] - tot), upp = Math.min(100,r[i] + tot);
            for (int j = low; j < upp; j++) {
                house[j] = 1;
            }
        }
        int count=0;
        for (int i=0;i<100;i++)
            if (house[i]==0)
                count++;

        System.out.println(count);
        //for (int i=0;i<house.length;i++)
        //System.out.print(i+"-"+house[i]+" , ");
    }
}
