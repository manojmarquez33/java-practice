import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Choose \n 1.ABCD\n 2.abcd\n 3.AaBb\n 4.aAbB\n 5.AbCd\n 6.aBcD");
        int a = in.nextInt();
        char ch;
        switch (a) {
            case 1:
                for( ch='A';ch<='Z';System.out.print(ch),ch++);
                break;
            case 2:
                for( ch='a';ch<='z';System.out.print(ch),ch++);
                break;
            case 3:
                for( ch='A';ch<='Z';System.out.print(ch+""+(char)(ch+32)),ch++);
                break;
            case 4:
                for( ch='A';ch<='Z';System.out.print((char)(ch+32)+""+ch),ch++);
                break;
            case 5:
                for(ch='A';ch<='Z';System.out.print(ch+""+(char)(ch+33)),ch+=2);
                break;
            case 6:
                for(ch='a';ch<='z';System.out.print(ch+""+(char)(ch-31)),ch+=2);
                break;

        
            default:
                break;
        }
    }
}
