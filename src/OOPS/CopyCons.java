package OOPS;

class Students4{
    int id;
    String name;
    Students4(int i ,String n){
        id = i;
        name = n;
    }

    Students4(Students4 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class CopyCons {
    public static void main(String[] args) {
        Students4 s1 = new Students4(111,"sunil");
        Students4 s2 = new Students4(s1);
        s1.display();
        s2.display();

    }
}
