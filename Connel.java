import java.util.Scanner;

public class Connel {
    public static void main(String[] args) {
        
        // int num=1;
        // int step=1;

        // while(num<=20){
        //     if(num!=1){
        //         num-=1;
        //     }

        //     for(int i=0;i<step;i++){
        //         System.out.print(num+" ");
        //         num+=2;
        //     }
        //     System.out.println();
        //     step++;
        // }

        int i,j,count=0,num=1;
        for(i=1;count<=20;i++)
        for(j=1;j<=i;System.out.print(num+""),j++,count++);
    }

}
