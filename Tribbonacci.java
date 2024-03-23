/*
* The Tribonacci Sequence:
0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609,
* 19513, 35890, 66012, 121415, 223317, 410744, 755476, 1389537, 2555757, 4700770,
* 8646064, 15902591, 29249425, 53798080, 98950096, 181997601, 334745777, 615693474,
*  1132436852…
* */
import java.util.Scanner;

public class Tribbonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),t1=0,t2=0,t3=1,temp1,temp2,temp3,i,j,n1=0,n2=0,n3=1;
        System.out.println("Enter number N :");

        System.out.print("------------------Approach 1----------------------\n");
        if(n==0 || n==1 || n==2)
            System.out.println(1);
        System.out.print(t1+" "+t2+" "+t3+" ");
        for (i=t1;i<n-3; System.out.print(t1+t2+t3+" "),temp1=t1,temp2=t2,t1=t2,t2=t3,t3+=temp1+temp2,i++);
//        System.out.println("\n"+i);

        System.out.print("------------------Approach 2----------------------\n");
        System.out.print(n1+" "+n2+" "+n3+" ");
        for (j=n1;j<n-3;temp3=n1+n2+n3,System.out.print(temp3+" "),n1=n2,n2=n3,n3=temp3,j++);
//        System.out.println("\n"+j);

    }
}
