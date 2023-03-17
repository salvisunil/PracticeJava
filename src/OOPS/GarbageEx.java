package OOPS;





public class GarbageEx {

    public void finalize(){
        System.out.println("garbage collection");

    }

    public static void main(String[] args) {
        GarbageEx g1 = new GarbageEx();
        GarbageEx g2 = new GarbageEx();
        g1=null;
        g2=null;
        System.gc();

    }
}
