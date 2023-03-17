package Method;

public class Addition {
    public static void main(String[] args) {
        int a =19;
        int b=5;
        int c=add(a,b); // method calling
        System.out.println("The sum of a and b="+c);

    }

    public static int add (int n1 , int n2)//parameters
    {
        int s;
        s=n1+n2;
        return  s;

    }
}
