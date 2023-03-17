package Inheritance;


class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking..");
    }

}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }

}
public class MultiLeval {
    public static void main(String[] args) {
        BabyDog b1 = new BabyDog();
        b1.weep();
        b1.bark();
        b1.eat();
    }
}
