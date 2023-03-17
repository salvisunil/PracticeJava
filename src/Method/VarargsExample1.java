package Method;

public class VarargsExample1 {
    static void display(String... values)
    {
        System.out.println("Display method invoked");
    }

    public static void main(String[] args) {
        display();
        display("my","name","is","varargs");
    }

}
