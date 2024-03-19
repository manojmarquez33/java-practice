import java.util.Scanner;

public class Fibboncci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t1=0,t2=1;
        int temp;
        System.out.print(t1+" "+t2+" ");
        for(int i=t1;i<=20;System.out.print(t1+t2+" "),temp=t1,t1=t2,t2+=temp,i++);
    }
}
