package Method;

import java.util.Scanner;

public class UserDefined {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        findUserDefined(num);

    }
    public static void findUserDefined(int num)
    {
        if(num%2==0)
        {
            System.out.println(num +" num is even");
        }
        else
            System.out.println(num +" num is odd");
    }
}
