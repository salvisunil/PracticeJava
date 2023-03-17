//import java.util.Scanner;
//
//public class ArmStrong {
//    public static void main(String[] args) {
//        int n,c,rem,arm=0;
//        System.out.println("Enter armstrong number");
//        Scanner sc=new Scanner(System.in);
//        n= sc.nextInt();
//        c=n;
//        while(n>0)
//        {
//            rem=n%10;
//            arm=(rem*rem*rem)+arm;
//            n=n/10;
//
//        }
//        if(c==arm)
//            System.out.println("Armstrong number");
//        else
//            System.out.println("not Armstrong number");
//
//    }
//}

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int n,rem,arm=0,c;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;

        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
            System.out.println("armstrong number");
        else
            System.out.println("not ar strong");
    }
}
