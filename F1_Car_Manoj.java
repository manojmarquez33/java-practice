import java.util.Scanner;

public class F1_Car_Manoj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),speed,count=1,curr;
        int fs = in.nextInt();
        speed = fs;
        for(int i=1;i<n;i++){
            curr = in.nextInt();
            if(curr< speed){
                count++;
            }
            speed = curr;

        }
        System.out.println(count);
    }
}
