package Method;

public class Bank {
    int getRateofInterest() {
        return 0;
    }
}

    class SBI extends Bank {

        int getRateofInterest() {
            return 8;
        }
    }

    class RBI extends Bank {
        int getRateofInterest() {
            return 7;

        }
    }

    class BOB extends Bank {
        int getRateofInterest() {
            return 6;
        }
    }


    class test {
        public static void main(String[] args) {
            SBI s = new SBI();
            RBI r = new RBI();
            BOB b = new BOB();
            System.out.println("SBI rateofInterest is: " + s.getRateofInterest());
            System.out.println("SBI rateofInterest is: " + r.getRateofInterest());
            System.out.println("SBI rateofInterest is: " + b.getRateofInterest());
        }
    }





