//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ReverseWord {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        String a [] = in.nextLine().split(" ");
//        Reverse(Arrays.toString(a));
//
//    }
//
//
//    public static String Reverse(String a){
//        String ab[] = new String[0];
//        for (String s : ab){
//            char ch[] = s.toCharArray();
//            //System.out.println(Arrays.toString(ch));
//            int l=ch.length-1,i;
//            for(i=0;i<=l/2;i++){
//                char c = ch[i];
//                ch[i] = ch[l-i];
//                ch[l-i]=c;
//                //System.out.println(true);
//            }
//
//            System.out.print(String.valueOf(ch)+" ");
//        }
//    }
//}
