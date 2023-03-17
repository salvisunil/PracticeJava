@FunctionalInterface
interface Drawable
{
    public void run();
}
public class Lambdaexpression {
    public static void main(String[] args) {
        int width=18;
        Drawable d2=()->
        {
            System.out.println("Student hi"+width);
        };
        d2.run();
    }
}
