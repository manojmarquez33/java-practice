/**
 * John is working in high security organization, where he needs to deal with lot of confidential documents.
 * He must encrypt the important number in documents. Please help John to write a program where the system should
 * identify the integer number and encrypt number based on John’s actions.
 *
 * Input
 * 123456
 * RLTDRRTRS2S1
 *
 * Output
 * 244156
 *
 * Explanation
 *
 * Initial string: 123456
 *
 * Action: RLTDRRTRS2S1
 *
 * R: 1[2]3456
 * L: [1]23456
 * T: [2]23456
 * D: [1]23456
 * R: 1[2]3456
 * R: 12[3]456
 * T:12[4]456
 * R: 124[4]56
 * S2: 144[2]56
 * S1: 244[1]56
 *
 * output string.
 *
 * Since all the actions from the action string are consumed and only first four characters of the input
 * string are processed leave the last two as they are and make them the part of
 * */
import java.util.Scanner;

public class Encrypt_john {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.next();
        char num[] =a.toCharArray();
        String op = in.next();
        char opt[] = op.toCharArray();
// 123456
        int index=0;
        for (int i=0;i<opt.length;i++) {
//            System.out.println(num);
            switch (opt[i]){
                case 'R':
                    index++;
                    break;
                case 'L':
                    index--;
                    break;
                case 'T':
                    num[index]= (char)(num[index]+1);
                    break;
                case 'D':
                    num[index]= (char)(num[index]-1);
                    break;
                case 'S':
                    int next = (int)(opt[i+1])-'0'-1;
                    if(next<num.length){
                    char temp = num[index];
                    num[index]=num[next];
                    //System.out.println(true);
                    num[next] = temp;}
                    ///else
                        //System.out.print(opt[i]+" "+next+" ");
                    i++;
                    break;
            }
        }

        System.out.println(String.valueOf(num));
        int n=0;
        for(char c : num){
            int dig = (int)c - 48;
            n = (n*10)+dig;

        }
        System.out.println(n);

    }
}
