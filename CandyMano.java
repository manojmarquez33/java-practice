import java.util.Scanner;

public class CandyMano {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        int aswin =0,mano=0,step=1;
        while (true){
            aswin+=step;
            if(aswin>a){
                System.out.println("Manoj wins");
                break;
            }
            step++;
            mano+=step;
            if (mano > m) {
                System.out.println("Aswin wins");
                break;
            }
            step++;
            }
        }
    }

