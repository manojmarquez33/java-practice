import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int time=4;
        int b[] = {1,2,3,4,5};
        Rightrotate(a,time);
        Leftrotate(b,time);
        System.out.println("-----------Right rotation-----------");
        for (int c:a){
            System.out.print(c+" ");
        }
        System.out.println("\n-----------Left rotation------------");
        for (int c:b){
            System.out.print(c+" ");
        }
    }
    public static void Rightrotate(int a[],int time){
        int l = a.length;
        for(int i=0;i<time;i++){
            int temp = a[l-1];
            for (int j=l-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
    }public static void Leftrotate(int b[],int time){
        int l = b.length;
        for(int i=0;i<time;i++){
            int temp = b[0];
            for (int j=0;j<l-1;j++){
                b[j] = b[j+1];
            }
            b[l-1] = temp;
        }
    }
}
