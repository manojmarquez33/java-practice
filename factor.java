import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i,limit = (int)Math.sqrt(n);


//        int limit = (int)Math.sqrt(n);
//        limit = (limit*limit == n) ? limit-1 : limit ;
//        for (i=1;i<limit;i++) {
//            if (n % i == 0) {
//                System.out.print(i + " " );
//            }
//        }
//
//        for (i=limit;i>0;i--){
//            if(n%i==0)
//                System.out.print(n/i+" ");}
//    }
//               if((limit+1)*(limit+1)==n)
//              System.out.print(limit+1);
//        }

//        int limit = (int)Math.sqrt(n);
//        for (i=1;i<limit;i++) {
//            if (n % i == 0) {
//                System.out.print(i + " " );
//            }
//        }
//        for (i=limit;i>0;i--){
//            if(n%i==0)
//            System.out.print(n/i+" ");}
//    }

        //-----------------------------------------------------------
//        int count = 0;
//        for (i = 1; i <n; i++)
//            if (n % i == 0)
//                count=1;
//
//        System.out.println(count==2 ? n : "not prime");
        //--------------------------------------------------------------
//        int count = 0;
//        for (i = 1; i <n/2; i+=2)
//            if (n % i == 0){
//                count=1;
//                break;
//                }
//        System.out.println(count==0 ? n +" Prime" : n+" NOT prime");

        //----------------------------------------------------------
//        for(i = 3; i <n/2 && n%i!=0;i++);
//        System.out.println(i>=n/2 ? "prime" : "not prime");
        //---------------------------------------------------
//        for(i = 3; i <n/2 && n%i!=0 && n%2!=0;i+=2); // mistake 4 is not a prime
//        System.out.println(i>=n/2 ? "prime" : "not prime");

        if(n%2==0 && n!=2){
            System.out.println("not prime");
        } else {
            for (i = 3; i < limit && n % i != 0; i += 2) ;
            System.out.println(i > limit ? "prime" : "no");
        }
    }
}

