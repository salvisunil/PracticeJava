package JavaExample;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        int num3 = num1+num2;
        System.out.println("Your Result:"+num3);
    }
}
