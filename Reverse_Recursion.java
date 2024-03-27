// reverse of number without loop

public class Reverse_Recursion {
    static int a[] = {1,2,3,4,5};
    static int i=0;
    public static void main(String[] args) {
        reverse(i-1);
    }
    public static void reverse(int i){
        if(i<4) {
            reverse(++i);
            System.out.print(a[i]+" ");
        }
    }
}
