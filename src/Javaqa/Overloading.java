package Javaqa;


public class Overloading {



        public void add()
        {
            int a=10,  b=20, c;
            c=a+b;
            System.out.println(c);

        }
        public void add(int x, int y)
        {
            int c;
            c=x+y;
            System.out.println(c);
        }
        public void add(int x1, Double y1)
        {
            double c;
            c=x1+y1;
            System.out.println(c);
        }

        public static void main(String[] args) {
            Overloading obj = new Overloading();
            obj.add();
            obj.add(200,100);
            obj.add(300,34.45);
        }
    }


