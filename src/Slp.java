public class Slp {
    public static void main(String[] args) {
        try
        {
            for(int i=100;100>=i;i--)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(InterruptedException ie)
        {
            System.out.println(ie);
        }
    }
        }
