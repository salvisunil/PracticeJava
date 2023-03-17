
@FunctionalInterface
interface c1
{
    void sunil(String msg);
}

public class FucationalInterface implements c1 {
   public  void sunil(String msg)
    {
        System.out.println(msg);
    }




    public static void main(String[] args) {
       FucationalInterface obj=new FucationalInterface();
       obj.sunil("hello sunil");


    }
}




