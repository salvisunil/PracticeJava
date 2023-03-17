package OOPS;


class Students3{
    int id;
    String name;
    int age;
    Students3(int i, String n){
        id = i;
        name = n;

    }
    Students3(int i, String n,int a ){ //constructor  overloading
        id = i;
        name = n;
        age = a;

    }


    void display(){
        System.out.println(id+" "+name);
    }
}
public class ParameterizedCons {
    public static void main(String[] args) {
        Students3 s1 = new Students3(111,"sunil");
        Students3 s2 = new Students3(121, "salvi");

        s1.display();
        s2.display();
    }
}
