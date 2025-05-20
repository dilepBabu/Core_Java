package OOPS_Basics;

public class BankAccount {

    private long accountNumber;
    private int amount = 0;

    public void deposit(int acno, int amount) {
        this.accountNumber = acno;
        this.amount = amount;
    }

    public int withdraw(int withdraw) {
        amount = amount - withdraw;
        return amount;
    }

    public void balance() {
        System.out.println("Account number : " + accountNumber + " Balance : " + amount);
    }

}

class Answer {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        customer1.deposit(2121121, 20000);
        customer1.balance();
        customer1.withdraw(10000);
        customer1.balance();
    }
}
