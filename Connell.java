/*Given an integer ‘n’, generate the first ‘n’ terms of the Connell Sequence.
Connell Sequence is the sequence formed with the first odd number,
i.e 1 as its first term. The subsequent terms of the sequence are made up of the first
two even numbers,
i.e 2 and 4, followed by the next three odd numbers, i.e 5, 7 and 9,followed by the next
four even numbers,
 i.e 10, 12, 14 and 16 and so on …. the sequence continues.

Input : 6
Output : 1 2 4 5 7 9

Input : 12
Output : 1 2 4 5 7 9 10 12 14 16 17 19

 */

import java.util.Scanner;
public class Connell {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        System.out.println("-------------------Method 1------------------------");
         int num=1;
         int step=1;

         while(num<=n){
             if(num!=1){
                 num-=1;
             }

             for(int i=0;i<step;i++){
                 System.out.print(num+" ");
                 num+=2;
             }
             System.out.println();
             step++;
         }
        System.out.println("-------------------Method 2------------------------");
        int i,j,count=1,num1=1;
        for(i=1;count<n;i++,System.out.println(),num1--)
            for(j=1;j<=i;System.out.print(num1+" "),j++,num1+=2,count++);

        System.out.println("-------------------Connell Sequence------------------------");
        int i1,j1,count1=1,num2=1;
        for(i1=1;num2<n;i1++,num2--)
            for(j1=1;j1<=i1;System.out.print(num2+" "),j1++,num2+=2,count1++);

//        System.out.println("practice");
//        int a,b,coun=1,nb=1;
//        for(a=1;)

    }

}
