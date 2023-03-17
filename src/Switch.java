public class Switch {
    public static void main(String[] args) {
        int number=44;
        String size;
        switch(number)
        {
            case 29:
                System.out.println("small");
                break;
            case 33:
                System.out.println("mediuam");
                break;
            case 44:
                System.out.println("large");
            break;
            default:
                System.out.println("unknown");
                break;


        }
        System.out.println("size: "+number);

    }
}
