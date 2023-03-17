package Array;

public class DisplayArray {
    public static void main(String[] args) {
        int [] marks={12,13,14,15,16};
        System.out.println("Printing using for loop");

        for(int i=1;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("printing using for loop reverse oder");
        for(int j=marks.length -1;j>=0;j--)
        {
            System.out.println(marks[j]);
        }
        System.out.println("For-each loop");
        {
            for(int element: marks)
            {
                System.out.println(element);
            }
        }
    }
}
