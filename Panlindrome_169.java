/*
Question:
Write a Java program that generates a palindrome using the 169 algorithm, which defines when we consider a number reverse and add until it becomes a palindrome. The program should take an integer as input and iteratively apply the following steps until it generates a palindrome greater than 10:
1. Check if the input number is already a palindrome and greater than 10. If so, stop.
2. If not, add the number to its reverse and repeat the process.

Sample Input/Output:
Input:
169

Output:
1441
Input:
234

Output:
666
*/
import java.util.*;
public class Panlindrome_169
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true){
            if(palindrome(n)==1 && n>10)
                break;
            n+=reverse(n);
            // System.out.println(n);
        }

    }
    public static int palindrome(int n){
        int len = (int)Math.log10(n)+1;
        int div = (int)Math.pow(10,len/2);
        int first = n%div;
        int rev_s = reverse(n/div);
        rev_s =(len%2==0)?rev_s:rev_s%div;
        if(rev_s==first){
            System.out.print(n);
            return 1;
        }
        else
            return 0;
    }
    public static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        return rev;
    }
}

