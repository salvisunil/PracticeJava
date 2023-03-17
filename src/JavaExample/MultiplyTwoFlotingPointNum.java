package JavaExample;

import java.util.Scanner;

public class MultiplyTwoFlotingPointNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Floating number 1:");
        float num1 = sc.nextFloat();
        System.out.println("Enter Floating number 2:");
        Float num2 = sc.nextFloat();
        Float num3 = num1*num2;
        System.out.println("your result:"+num3);
    }
}
