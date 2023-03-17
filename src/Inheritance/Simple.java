package Inheritance;

class  Student  //SUPER CLASS
{
    int roll;
    String name;
    Float marks;

    void input() {
        System.out.println("Enter roll name & marks: ");

    }
}
class  sunil extends Student   //sub class
    {
        void disp(){
            roll =1; name="Sunil"; marks =97.09f;
            System.out.println(+roll+" "+name+""+marks)  ;
        }

        }



public class Simple {
    public static void main(String[] args) {
        sunil s1 = new sunil();



    }
}
