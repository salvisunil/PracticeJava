//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        int n,c,r,s=0;
//        System.out.println("Enter a number");
//        Scanner sc=new Scanner(System.in);
//        n = sc.nextInt();
//        c=n; //change n value assign in c
//
//        while(n>0)
//        {
//            r=n%10;
//            s=s*10+r;
//            n=n/10;
//
//
//        }
//        if(c==s)
//            System.out.println("palindrome number");
//        else
//            System.out.println("not palindrome number");
//    }
//}


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, rem, s=0, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
         n = sc.nextInt();
        c=n;

        while(n>0) //121 >0
        {
            rem=n%10; //121%10=1, 2, 1%10=0
            s=s*10+rem; //0+1=1 ,1*10+2=12, 12*10+1
            n=n/10; //12,1,0

        }
        if(c==s)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome number");

    }
}
