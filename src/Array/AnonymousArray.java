package Array;

public class AnonymousArray {
    public static void PrintArrayint (int arr[])
    {
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        PrintArrayint(new int []{10,120,203,40,30});
        //passing anonymous array to method
    }
}
