class MyThread1 extends Thread{
    public void run(){
        System.out.println("My Thread is running");
        System.out.println("I am happy");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread is 2 good");
        System.out.println("I am sad");
    }
}
public class CreatingThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
