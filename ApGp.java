import java.util.Scanner;

public class ApGp {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int start = in.nextInt(),end=in.nextInt(),step=in.nextInt(),opt=in.nextInt();

        switch (opt) {
            case 1:
                for(int i=start;i<=end;System.out.print(i+" "),i+=step);
                break;
            case 2:
                for(int i=start;i<=end;System.out.print(i+" "),i*=step);
                break;
        
            default:
                break;
        }

    }
}
