class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("i am a Thread 1 not a Thread1");

    }
}
class MyThreadRunnable2 implements Runnable
{
    public void run()
    {
        System.out.println("i am Thread 2 not a Thread 2");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        MyThreadRunnable1 Bullet1= new MyThreadRunnable1();
        Thread gun1 = new Thread(Bullet1);

        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(Bullet2);

            gun1.start();
            gun2.start();

    }
}
