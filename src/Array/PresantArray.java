package Array;

public class PresantArray {
    public static void main(String[] args) {
        float[] marks = {23.45f, 45.56f, 56.67f, 56.45f};
        float num = 23.45f;
        boolean isInArray = false;
        for (float elements : marks) {
            if (num == elements) {
                isInArray = true;
                break;
            }
        }
        if (isInArray)
            System.out.println("presant array");
        else {
            System.out.println("Not prseant");
        }

    }
}
