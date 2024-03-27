import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDemand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),sum=0;
        int a[] = new int[n];
        int demand [] = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = in.nextInt();
            sum+=a[i];
        }
        for(int i=0;i<n;i++){
            demand[i] = sum - a[i];
        }
        for (int c : demand)
            System.out.print(c+" ");
        Arrays.sort(demand);
        System.out.println("\n"+demand[n-1]);
    }
}
