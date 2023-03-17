package OOPS;

//java program to demonstrate the working  of a banking system
//where we deposit and withdrawn amount from our account
//creating Account class which has deposit()  and withdrawn() methods


class Account {
    int acc_no;
    String name;
    float amount;

    //Method to initialize object
    void insert(int a, String n, float amt){
        acc_no =a ;
        name = n;
        amount = amt;
    }
//deposit method
    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt+"deposited");


    }
    //withdrawn method
    void withdrawn(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }
        else {
            amount = amount -amt;
            System.out.println(amt+ "withdrawn");
        }

    }
    //method check the  balance of the amount
    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);

    }

}
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(3236287,"sunil",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(20000);
        a1.checkBalance();

        a1.withdrawn(3000);
        a1.checkBalance();



    }
}