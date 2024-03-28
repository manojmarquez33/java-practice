import java.util.Arrays;
import java.util.Scanner;

public class FormBigN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt(),large = 0;
        int l = (int)Math.log10(n)+1;
        int a[] = new int[10];

        for(int i=0;i<l;i++){
            a[(int)(n%10)]+=1; //
            n/=10;
        }
        System.out.println(Arrays.toString(a));

        for (int i=9;i>-1;i--){
            while(a[i]>0){
                large*=10;
                large+=i;
                a[i]--;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(large);
    }
}

