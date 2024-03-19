import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

    //     double a = in.nextDouble();
    //     int dig = in.nextInt(),space = in.nextInt();

    //     // for(int i=0;i<=space;i++){
    //     //     System.out.print(" ");
    //     // }

    // //System.out.printf("%.3f",a);

    // System.out.print(String.format("%"+space+"."+dig+"f",a));

    double d = (int)12.1;

    System.out.println((float)d);

    float e = 15.2f;

    System.out.println((int)e+1);

    System.out.println(e-(int)e == 0 ? e :( (int)e+1));

    System.out.println(e-(int)e == 0 ? ((int)e) : (int)e+1);


    

 
    }
}