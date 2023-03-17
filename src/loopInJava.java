public class loopInJava {
    public static void main(String[] args) {
//        int i;
//        for(i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }
        //break statement
        int i=0;
        while(i<5)
        {
            System.out.println("java is great");
            if(i==2)
            {
                System.out.println("ending the loop");
                break;

            }
            i++;

        }
        System.out.println("loop ends here");
    }
}
