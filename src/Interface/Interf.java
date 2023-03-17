package Interface;
@FunctionalInterface

interface sayable{
    void say(String msg);   // abstract method
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
public class Interf implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Interf fie = new Interf();
        fie.say("Pavan sunil are best friends");
    }
}
