package JavaExample;

public class SwapNumbers {
    public static void main(String[] args) {
        float first = 1.02f, second =2.43f;
        System.out.println("--Before Swap--");
        System.out.println("First number= "+first);
        System.out.println("second number= "+second);
         float temp = first;

         first = second;

         second = temp;

        System.out.println("--After swap--");
        System.out.println("First number= "+first);
        System.out.println("Second number= "+second);


    }
}
