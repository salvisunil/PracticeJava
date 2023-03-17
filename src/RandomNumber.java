import java.math.*;
public class RandomNumber {
    public static void main(String[] args) {
//        System.out.println("1st random number"+Math.random());
//        System.out.println("2nd random number"+Math.random());
//        System.out.println("3rd random number"+Math.random());
//        System.out.println("4rd random number"+Math.random());
//    }
//}
//
        int row = 6;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}