// reverse of number without loop

public class Reverse_number {
    static int a = 123456;

    public static void main(String[] args) {

        reverse(a);
    }
    public static void reverse(int a){
        if(a>0) {
            System.out.print(a%10);
            reverse(a/10);

        }
    }
}
