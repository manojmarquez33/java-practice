import java.util.Scanner;

public class ApGp {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start,end & step \n Choose 1 or 2 \n 1.Arithmetci Progession \n 2.Geometric progression");
        int start = in.nextInt(),end=in.nextInt(),step=in.nextInt(),opt=in.nextInt(),i,j;

        switch (opt) {
            case 1:
                for(i=start;i<=end;System.out.print(i+" "),i+=step);
                System.out.println("\nArithmetic Progression End-------------------------------------");
                break;
            case 2:
                for(i=start;i<=end;System.out.print(i+" "),i*=step);
                System.out.println("\nGeometric Progression End-------------------------------------");
                break;

            default:
                break;
        }

    }
}
