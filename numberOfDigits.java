import java.util.Scanner;

public class numberOfDigits {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
     int n = in.nextInt(),nod=0,div=1;

     for(;n/div>0;div*=10,nod++);

        System.out.println(nod);
        System.out.println(n);

    }
}
