package Method;

public class Static_Method {
    static void change(int a)
    {
        a=90;
    }
    static void change2(int [] arr)
    {
        arr[0]=98;
    }

    static void telljoke() //called static method object create without call
    {
        System.out.println("Hello telljoke");
    }

    public static void main(String[] args) {
    //    telljoke();
        //case1 : changing the Integer
    int marks[]={67,98,67,45,97};
//        int x=45;
//        change(x);
//        System.out.println("The value of x after running chnage is: "+x);

        //case2 changing the Array
        change2(marks);
        System.out.println("The value of x after running change is: "+marks[0]);
    }
}
