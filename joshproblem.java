import java.util.Scanner;

public class joshproblem {
    
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),pos,pow,survive;
        for(pos=1;pos<=n;pos*=2);
        int intial = in.nextInt();
        pow = n- (pos/2);
        //survive = 2*(n-pow)+intial;
        System.out.println((pow*2+intial)%n);

       // System.out.println(survive<n ? survive : survive-n);

      
    }
}
