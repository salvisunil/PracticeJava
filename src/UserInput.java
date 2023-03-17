import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter number 1:");
        //boolean b1 = sc.hasNextInt();
       // System.out.println(b1);
       // float a = sc.nextFloat();
       // int a = sc.nextInt();
        //System.out.println("enter number 2:");
    //    float b= sc.nextFloat();
        //int b = sc.nextInt();
      //  float sum=a+b;
        //int sum = a+b;65
        //System.out.println("result");
        //System.out.println(sum);
       // String str=sc.next();
       // System.out.println(str);
//        System.out.println("Enter an Integer:");
//        int number=sc.nextInt();
//        System.out.println("you have entered " +number);
        System.out.println("Enter Float");
        float number=sc.nextFloat();
        System.out.println("Float entered "+number);
        System.out.println("Enter double");
        double d1=sc.nextDouble();
        System.out.println("double entered "+d1);
        System.out.println("Enter Text");
        String s1= sc.next();
        System.out.println("text Entered = "+s1);

    }
}
