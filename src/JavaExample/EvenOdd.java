package JavaExample;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        if(num%2==0)
            System.out.println("Number is even: "+num);
        else
            System.out.println("Number is Odd: "+num);
    }
}
