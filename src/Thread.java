//public class Thread extends java.lang.Thread {
//    public void run()
//    {
//        try
//        {
//            for(int i=0;i<=10;i++){
//                System.out.println("child Thread");
//                java.lang.Thread.sleep(1000);
//            }
//        }
//        catch (java.lang.Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        Thread d=new Thread();
//        d.start();
//        try
//        {
//            for(int i=1;i<=10;i++){
//                System.out.println("main thrad");
//                java.lang.Thread.sleep(1000);
//            }
//        }
//        catch (java.lang.Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//
//
//}



public class   Thread extends java.lang.Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("child class");
                Thread.sleep(1000);

            }

        } catch (java.lang.Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        java.lang.Thread f1 = new Thread();
        f1.start();


        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("main method");
                Thread.sleep(1000);
            }
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }

    }

}