

 class MyTr1  extends Thread
 {
     public void run()
     {
         int i=0;
         while(true)
         {
             try
             {
                 Thread.sleep(1000);
                 System.out.println("The current thread name is"+Thread.currentThread().getState());
             }
             catch (InterruptedException ie)
             {
                 System.out.println("the exception has been caught:"+ie);

             }

         }
     }

 }
public class JoinMethod {
    public static void main(String[] args) {
        MyTr1 t1 = new MyTr1();
        t1.start();

        }


    }

