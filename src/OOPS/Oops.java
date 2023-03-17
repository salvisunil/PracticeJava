package OOPS;

import java.util.Scanner;

class Students { //class
    int rollno; //object attribute
    String name;
    Float marks;

    public void display(){
        System.out.println("Students data");
    }
    public void printrollno(){
        System.out.println(this.rollno);
    }

}
public class Oops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Students RollNo: ");
//        int rollno = sc.nextInt();
//        System.out.println("Enter students Name: ");
//        String name = sc.next();
//        System.out.println("Enter students marks: ");
//        Float marks = sc.nextFloat();
//        System.out.println("Display result here:" +rollno +name +marks);

        Students sunil = new Students(); //creating an object of Student
        sunil.rollno= Integer.parseInt("123");
        sunil.name="sunil";
        sunil.marks=78f;

        sunil.display();
        sunil.printrollno();
    }
}
