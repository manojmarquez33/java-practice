import java.util.*;
public class KadanesAlgo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE,sum=0;
        int tot=sc.nextInt();
        int[] n=new int[tot];
        for(int j=0;j<n.length;j++){
            n[j]=sc.nextInt();
        }

        for(int i:n){
            sum=sum+i;
            if(max<sum){
                max=sum;
            }if(sum<0){
                sum=0;
            }
        }
        System.out.print(max);
    }
}