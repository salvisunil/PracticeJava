import java.util.Scanner;

public class factorialUsingRecursion {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any number");
        n=r.nextInt();
        factorialUsingRecursion obj = new factorialUsingRecursion();
        int result=obj.fact(n);
        System.out.println();
        System.out.println("Factorial of given number: "+result);


    }
    int fact(int n)
    {
        if(n==1)
            return 1;
        else
           return n*fact(n-1);


    }
}




