import java.util.Scanner;
//01 1 2
public class fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1,c;
        System.out.println("enter any nummber");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
}
