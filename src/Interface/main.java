package Interface;


public class main {
    public static void main(String[] args) {
//        MyInter myInter= new MyInterImpl();
//        myInter.SayHello();
        System.out.println("start");

//        MyInter i = new MyInter() {
//            @Override
//            public void SayHello() {
//                System.out.println("This is first anonymous class");
//            }
//        };
//        i.SayHello();
//        MyInter i2 = new MyInter() {
//            @Override
//            public void SayHello() {
//                System.out.println("this is my second anonymous class");
//            }
//        };i2.SayHello();

        MyInter i = ()->{
            System.out.println("this is first using lamda");
        };i.SayHello();
    }



        }
