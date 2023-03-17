package Interface;

import java.util.Scanner;

public interface Inter {
    void input();

        void output();

}
class Dev implements Inter {
    String name; Double sal;
   public  void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name= sc.nextLine();
        System.out.println("enter salaray: ");
        sal = sc.nextDouble();

    }
  public   void output()
    {
        System.out.println(name +" "+sal);
    }

    public static void main(String[] args) {
        Inter obj=new Dev();
        obj.input();
        obj.output();
    }
}

