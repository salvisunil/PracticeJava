package OOPS;

class Employee{
    int id;
    String name;
    Float salray;

    public void insert(int i ,String n, Float s){
        id = i;
        name = n;
        salray = s;


    }
    void Display(){
        System.out.println(id+" "+name+" "+salray);
    }


}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(123,"Sunil",78.89f);
        e2.insert(121,"ajay",98.90f);
        e3.insert(124,"jekal",56.09f);

        e1.Display();
        e2.Display();
        e3.Display();



    }
}
