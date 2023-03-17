package Array;

public class Fl_Sum {
    public static void main(String[] args) {
        float [] marks={45.67f,67.45f,67.45f,89.45f,98.56f};
         float sum =0;
         for (float elements:marks)
         {
             sum=sum+elements;
         }
        System.out.println("the value of sum is:"+sum);
    }
}
