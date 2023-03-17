//package Exam2;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class DateApi {
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner (System.in);
//        System.out.println("Enter date");
//        String Userdate =Sc.next();
//
//        LocalDate date = LocalDate.parse(Userdate);
//        System.out.println("Year:"+date.getYear());
//        System.out.println("Month:"+date.getMonth());
//        System.out.println("Date:"+date.getDayOfMonth());
//        System.out.println("Day:"+date.getDayOfWeek());
//    }
//}

import java.time.LocalDate;
import java.util.Scanner;

public class DateApi{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date");
        String UserDate =sc.next();

        LocalDate date=LocalDate.parse(UserDate);
        System.out.println("Year:"+date.getYear());
        System.out.println("Month:"+date.getMonth());
        System.out.println("Date:"+date.getDayOfMonth());
        System.out.println("Day:"+date.getDayOfWeek());


    }

}
