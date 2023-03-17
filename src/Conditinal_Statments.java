import java.util.Scanner;

public class Conditinal_Statments {
    public static void main(String[] args) {
//        int a=20;
//        int b=12;
//        int c=a+b;
//        if(a+b>20)
//        {
//            System.out.println("a+b is greather than 20"); // simple if statments
//        }
//
//        int age =19;
//
//        if(age>=18)
//        {
//
//            System.out.println("Yes boy you can Drive!");//if else statment
//        }
//        else
//        {
//            System.out.println("No boy you cannot drive yet!");
//        }
//
//        boolean a=false;
//        boolean b=false;
//        boolean c=true;
//        if(a ||b)
//        {
//            System.out.println("Truee");logic opration and or not
//        }
//        else {
//            System.out.println("false");
//        }
//

//        String city ="delhi";
//        if(city=="palanpur")
//        {
//            System.out.println("city is palanpur");
//        }
//        else if(city =="surat")
//
//        {
//            System.out.println("city is surat");
//        }
//        else if(city=="nadiad")
//        {
//            System.out.println("city is nadiad");
//        }
//        else
//        {
//            System.out.println(city);
//        }

      /*  String city="Delhi,India,";

        if(city.endsWith("india"))
        {
            if (city.contains("palanpur")) {
                System.out.println("your is city palanpur");
            } else if (city.contains("noida")) {
                System.out.println("your city is noida");
            } else {
                System.out.println(city.split(",")[0]);
            }
        }

            else
            {
                System.out.println("you are not living in india");


        }*/

        int age;
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch (age)
        {
            case 18:
                System.out.println("you are going to become an Adult!");
                break;
            case 21:
                System.out.println("you are going to join a job!");
                break;
            case 60:
                System.out.println("you are going get retire");
                break;
            default:
                System.out.println("enjoy life");
        }


        }

    }

