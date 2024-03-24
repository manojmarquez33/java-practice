/**
 Problem Statement:

 Chef went to the store in order to buy one can of coke. In the store, they offer \(N\)
 cans of coke (numbered \(1\) through \(N\)). For each valid \(i\), the current
 temperature of the \(i\)-th can is \(C_i\) and its price is \(P_i\).

 After buying a can of coke, Chef wants to immediately start walking home; when he
 arrives, he wants to immediately drink the whole can. It takes Chef \(M\) minutes
 to get home from the store.

 The ambient temperature outside is \(K\). When a can of coke is outside, its
 temperature approaches the ambient temperature. Specifically, if its temperature is
 \(t\) at some point in time:

 - if \(t > K + 1\), then one minute later, its temperature will be \(t - 1\)
 - if \(t < K - 1\), then one minute later, its temperature will be \(t + 1\)
 - if \(K - 1 \leq t \leq K + 1\), then one minute later, its temperature will be \(K\)

 When Chef drinks coke from a can, he wants its temperature to be between \(L\) and
 \(R\) (inclusive). Find the cheapest can for which this condition is satisfied or
 determine that there is no such can.

 Input
 The first line of the input contains a single integer \(T\) denoting the number of
 test cases. The description of \(T\) test cases follows.
 The first line of each test case contains five space-separated integers \(N\), \(M\),
 \(K\), \(L\) and \(R\).
 \(N\) lines follow. For each \(i\) (\(1 \leq i \leq N\)), the \(i\)-th of these lines
 contains two space-separated integers \(C_i\) and \(P_i\).

 2
 3 2 5 4 6
 1 6
 2 8
 8 10
 3 5 10 20 30
 21 20
 22 22
 23 23


 Output
 For each test case, print a single line containing one integer — the price of the can
 Chef should buy, or \(-1\) if it is impossible to buy a can such that Chef's condition
 issatisfied.

 8
 -1
 */


import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Coak_cheff
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t > 0) {

            System.out.println("Enter number of coak : ");
            int n = in.nextInt();
            // optimal temp


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