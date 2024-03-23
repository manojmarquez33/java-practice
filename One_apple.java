import java.util.Scanner;

public class One_apple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Gates");
        int gate = in.nextInt(),apple = 1;

        while (gate>0){
            apple=(apple+1)*2;
            gate--;
        }
        System.out.println(apple+" apple he pluck from tree");
    }
}
