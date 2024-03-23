//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Coak_cheff {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number of coak : ");
//        int n = in.nextInt();
//        int k = 5; // optimal temp
//        System.out.println("Enter "+n+" coak temp :");
//        int temp[] =  new int[n];
//        for(int i=0;i<n;i++)
//            temp[i]=in.nextInt();
//
//        //System.out.println("Before temp update : "+Arrays.toString(temp));
//
//        System.out.println("Enter lower and upper range");
//        int l=in.nextInt(),u=in.nextInt();
//        System.out.println("Enter the distance M");
//        int m = in.nextInt();
//
//        System.out.println("Enter "+n+" coak price :");
//        int price [] = new int[n];
//        for(int i=0;i<n;i++)
//            price[i]=in.nextInt();
//
//        for(int j=0;j<n;j++) {
//            for(int i=0;i<m && temp[j] != k;i++){
//                if (k > temp[j])
//                    temp[j]+=1;
//                else if (k < temp[j])
//                    temp[j]-=1;
//            }
//        }
//        int cheap = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++) {
//            if (temp[i]>=l && temp[i]<=u && price[i]<cheap){
//                cheap = price[i];
//            }
//
//        }
////        System.out.println("After temp update : "+Arrays.toString(temp));
////        System.out.println("After price update"+Arrays.toString(price));
//        System.out.println(cheap);
//
//    }
//}
//
//


import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t > 0) {

            //System.out.println("Enter number of coak : ");
            int n = in.nextInt();
            // optimal temp
            //System.out.println("Enter " + n + " coak temp :");

            int m = in.nextInt();
            int k = in.nextInt();
            //System.out.println("Before temp update : "+Arrays.toString(temp));

            //System.out.println("Enter lower and upper range");
            int l = in.nextInt(), u = in.nextInt();
            // System.out.println("Enter the distance M");


            //System.out.println("Enter " + n + " coak price :");

            int temp[] = new int[n];

            int price[] = new int[n];
            for (int i = 0; i < n; i++){
                temp[i] = in.nextInt();
                price[i] = in.nextInt();
            }

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m && temp[j] != k; i++) {
                    if (k > temp[j])
                        temp[j] += 1;
                    else if (k < temp[j])
                        temp[j] -= 1;
                }
            }
            int cheap = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (temp[i] >= l && temp[i] <= u && price[i] < cheap) {
                    cheap = price[i];
                }

            }
            if(cheap==Integer.MAX_VALUE)
                cheap=-1;
            //        System.out.println("After temp update : "+Arrays.toString(temp));
            //        System.out.println("After price update"+Arrays.toString(price));
            System.out.println(cheap);
            t--;
        }
    }
}