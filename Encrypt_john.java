import java.sql.SQLOutput;
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

    }
}
