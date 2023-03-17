package OOPS;


class A1 {
    int id;
    String name;
    float fee;

    A1(int id, String name, float fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(+id + " " + name + " " + fee);

    }

}


public class ThisKeyword {
    public static void main(String[] args) {
        A1 ref = new A1(111,"sunil",2330f);
        A1 ref2 = new A1(121, "salvi ",3495f);

        ref.display();
        ref.display();

    }
}
