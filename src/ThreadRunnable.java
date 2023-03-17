// class ThreadRunnable implements Runnable {
//    public void run()
//    {
//        for(int i=0;i<=10;i++)
//        {
//            System.out.println("child class");
//
//
//        }
//    }
//
//     public static void main(String[] args) {
//         Thread t1 = new Thread();
//         t1.start();
//         for(int i=0;i<=10;i++)
//         {
//             System.out.println("parent  class");
//
//
//         }
//     }
//}

public class ThreadRunnable implements Runnable{
    public void run()
    {
        for (int i=1 ;i<=10;i++) {
            System.out.println("chaild class");
        }
    }


    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.start();

        for (int i=1;i<=10;i++){
            System.out.println("mai class");
        }

    }

    }
