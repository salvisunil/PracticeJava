package Javaqa;

public class Shape {
    public void Draw()
    {
        System.out.println("can't say shape type");
    }

}
class square extends Shape{

    @Override
    public void Draw()
    {
       // super.Draw();
        System.out.println("square shape");
    }
}
class Demo
{
    public static void main(String[] args) {
        Shape obj = new square();
        obj.Draw();

    }
}
