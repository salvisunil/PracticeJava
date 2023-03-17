package OOPS;

class a1 {
    a1 show() {
        System.out.println("inside the class a1");
        return this;
    }
}

class  b1 extends a1 {
    @Override

    b1 show(){

        System.out.println("Inside the class b1");
        return this;
    }
}
public class Covarient {
    public static void main(String[] args) {
        b1 b = new b1();
        b.show();

    }
}
