package OOPS;

class A{
    int rollno;
    String name;
    /*A()
    {
        rollno = 1;
        name = "Sunil";

    }*/
    void show(){
        System.out.println("Display constructor value:"+rollno+" "+name);
    }
}
public class DemoConstructor {
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}
