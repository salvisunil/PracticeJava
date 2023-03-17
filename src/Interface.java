import java.util.Scanner;

//import java.util.Scanner;
//
//interface client
//{
//    void input();
//    void output();
//}
//
//public class Interface implements c1 {
//    String name; Double sal;
//   public  void input(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter UserName");
//        name=sc.nextLine();
//       System.out.println("Enter salary");
//       sal=sc.nextDouble();
//
//
//    }
//    public void output()
//    {
//        System.out.println(name+" "+sal);
//    }
//
//    public static void main(String[] args) {
//        c1 obj=new Interface();
//        obj.input();
//        obj.output();
//    }
//
//
//}
//interface client{
//    void input();
//    void output();
//}
//
// class Interface implements client {
//    String name; Double sal;
//   public  void input()
//    {
//        System.out.println("Enter username");
//        Scanner sc= new Scanner(System.in);
//        name=sc.nextLine();
//        System.out.println("Enter salary");
//        sal=sc.nextDouble();
//
//
//    }
//    public void output()
//    {
//        System.out.println(name+" "+sal);
//
//    }
//
//
//
//
//    public static void main(String[]args){
//       client obj=new Interface();
//       obj.output();
//       obj.input();
//
//
//    }
//
//}



interface client{

    void inuput();
    void output();





}
 class Interface implements client{


        String name; Double s1;

      public   void inuput()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name:");
            name=sc.nextLine();
            System.out.println("enter salary:");
            s1=sc.nextDouble();

        }
        public void output()
        {
            System.out.println(name+""+s1);
        }

    public static void main(String[] args) {
        client obj=new Interface();
        obj.inuput();
        obj.output();
    }

    }



