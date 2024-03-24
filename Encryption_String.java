import java.util.Scanner;

public class Encryption_String {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a  = in.next();
        char []s = a.toCharArray();
        for (int i=0;i<s.length;i++) {
            if ((int) s[i] % 2 == 1)
                s[i] = (char) (((s[i] + 30) * 2) + 5);
            else
                s[i] = (char) ((((s[i] * 2) + 2) * 5) + 5);
        }

        String en = new String(s);
        System.out.println(en);

//        char enc[] = en.toCharArray();
//        for (int i=0;i<enc.length;i++) {
//            //if ((int) enc[i] % 2 == 0)
//
//            char f=(((char) (((enc[i] - 5) / 2) - 30)));
//
//            char sec=(((char) ((((enc[i] - 5) / 5) - 2) / 2)));
//            if(f<65 && f>122 && sec>65 && sec<122)
//                System.out.print(f);
//            System.out.print(sec);
//        }
//        String dec = new String(enc);
//        //System.out.println(dec);
    }
}
