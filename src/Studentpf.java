import java.util.Scanner;

public class Studentpf {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in English");
        m1=sc.nextByte();
        System.out.println("Enter your marks in gujarati");
        m2=sc.nextByte();
        System.out.println("Enter your marks in science");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your overall percentage "+avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratulations you are pass!");
        }
        else {
            System.out.println("sorry your are fail");

        }

    }

}
