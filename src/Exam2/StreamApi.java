package Exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class StreamApi {
//    public static void main(String[] args) {
//        String name;
//        Integer m1;
//        int no;
//        System.out.println("Enter no:-");
//        Scanner sc=new Scanner(System.in);
//        no=sc.nextInt();
//        Map<String, Integer> map=new HashMap();
//
//        for(int i =0; i < no;i++)
//        {
//            System.out.println("Enter name:-");
//            name=sc.next();
//            System.out.println("Enter marks:-");
//            m1= sc.nextInt();
//            map.put(name,m1);
//
//            map.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 30 && stringIntegerEntry.getValue() < 50).forEach(System.out::println);
//
//
//
//        }
//
//
//    }
//}
public class StreamApi
{
    public static void main(String[] args) {
        Integer m1; String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber:-");
        int no=sc.nextInt();
        Map<String,Integer>map=new HashMap<>();

        for(int i=0;i<no;i++)
        {
            System.out.println("Enter name:");
            name=sc.next();
            System.out.println("Enter marks:");
            m1=sc.nextInt();
            map.put(name,m1);

            map.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 30 && stringIntegerEntry.getValue() < 50).forEach(System.out::println);



        }
    }
}
