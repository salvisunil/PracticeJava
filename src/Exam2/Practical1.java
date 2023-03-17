package Exam2;

import java.util.HashMap;
import java.util.Scanner;

@FunctionalInterface
interface Calculator
{
    int calculate(int num1 ,int num2);

}
public class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Opration");
        int Numofop = sc.nextInt();
        int [] num1 = new int[Numofop];
        int [] num2 = new int [Numofop];
        int [] Optertype = new int [Numofop];

        for(int i=0; i<Numofop; i++)
        {
            System.out.println("type of oprater:");
            Optertype[i]= sc.nextInt();
            System.out.println("num1:");
            num1 [i]=sc.nextInt();
            System.out.println("num2:");
            num2 [i]=sc.nextInt();

        }

        for(int i =0; i<Numofop;i++)
        {
            performCalculation(Optertype[i],num1[1],num2[2]);
        }

    }
    public static void performCalculation (int num1 , int num2, int Optertype)
    {
        Calculator plus , minus, Multiply;
        HashMap<Integer,Calculator>calculatorMap=new HashMap<>();
        plus=(n1,n2)->(n1+n2);
        minus= (n1,n2)->(n1-n2);
        Multiply=(n1,n2)->(n1*n2);
        calculatorMap.put(1,plus);
        calculatorMap.put(2,minus);
        calculatorMap.put(3,Multiply);
        System.out.println(calculatorMap.get(Optertype).calculate(num1, num2));
    }

    public int calculate(int num1 , int num2)
    {
        return 0;
    }
}