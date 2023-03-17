package OOPS;


class Students5 {
    int id;
    String name;
    static  String collage="DDIT"; // static variable

    Students5(int i , String n){
        id=i;
        name = n;


    }
    void display(){
        System.out.println(id+" "+name+" "+collage);
    }



}
public class StaticKeyword {
    public static void main(String[] args) {
        Students5 s1 = new Students5(111,"sunil");
        Students5 s2 = new Students5(121,"kiran");
        s1.display();
        s2.display();
    }
}
