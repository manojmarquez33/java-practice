import java.util.Scanner;

public class Encry_Decry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        int len = a.length();
        char temp,temp2;
        char s[] = a.toCharArray();

//        for (int i=0,j=len-1;i<len/2;i++,j--){
//            s[i] = (i%2==1) ? (char)(s[i]+=12): (char)(s[i]-=1);
//            s[j] = (j%2==1) ? (char)(s[j]+=12): (char)(s[j]-=1);
//            temp = s[i];
//            s[i]=s[j];
//            s[j]=temp;
//        }
//        if(((len-1)/2)%2==0)
//                s[(len-1)/2] = (char)(s[(len-1)/2]-1);
//
//        System.out.println(String.valueOf(s));

        // -------------------------------------------------
        for (int i=0,j=len-1;i<len/2;i++,j--){
            s[i] = (i%2==1) ? (char)(s[i]+=12): (char)(s[i]-=1);
            s[j] = (j%2==1) ? (char)(s[j]+=12): (char)(s[j]-=1);
//            s[i+1] = ((i+1)%2==1) ? (char)(s[i+1]+=12): (char)(s[i+1]-=1);
//            s[j-2] = ((j-1)%2==1) ? (char)(s[j-1]+=12): (char)(s[j-1]-=1);

            temp = s[i];
            s[i]=s[j];
            s[j]=temp;

//            temp2 = s[i+1];
//            s[i+1]=s[j-1];
//            s[j-1]=temp2;
        }
        if(((len-1)/2)%2==0)
                s[(len-1)/2] = (char)(s[(len-1)/2]-1);

        System.out.println(String.valueOf(s));

        // --------------------------------------------------


//        char arr[] = a.toCharArray();
//        for (int i=0;i<arr.length;i++) {
//            if (i % 2 == 1)
//                arr[i] = (char) (((int) arr[i]) + 12);
//            else
//                arr[i] = (char) (((int) arr[i]) - 1);
//            //System.out.print(arr[i] + "");
//        }
//        System.out.println(String.valueOf(arr));
        //System.out.println(sb.reverse());
//
//        -------------------------------------------------
//
//        StringBuffer de = new StringBuffer(sb.toString());
//        de.reverse();z
//        char decr[] = (de.toString().toCharArray());
//        for (int i=0;i<decr.length;i++)
//            if(i%2==1)
//                decr[i] = (char)((int)decr[i]-12);
//            else
//                decr[i] = (char)((int)decr[i]+1);
//
//        System.out.println(de);

    }
}
