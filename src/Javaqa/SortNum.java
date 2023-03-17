package Javaqa;

import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        int temp;
        System.out.println("Enter elements of array number: ");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) //i=0
        {

            for (int j = i + 1; j < 8; j++) //j=1
            {
                if (arr[i] > arr[j]) //13,12,10,3
                {
                    //swap
                    temp = arr[i]; //
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < 8; i++)
            System.out.println(arr[i] + " ");
    }
}
