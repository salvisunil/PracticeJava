@FunctionalInterface
interface lambda1{
    public void run();
}
class lambda {
    public static void main(String[] args) {
        lambda1 r1 = () -> {
            System.out.println("this is first lamda");
        };r1.run();
        lambda1 r2=()->
        {
            System.out.println("this is second lambda");
        };
        r2.run();

    }

}
