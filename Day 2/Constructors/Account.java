package Constructors;

public class Account {
    int accountNumber = 0;
    int balance = 0;

    public Account() {
        accountNumber = 0;
        balance = 0;

    }

    public Account(int acno, int bal) {
        this.accountNumber = acno;
        this.balance = bal;
    }

    public Account(int acno) {
        this.accountNumber = acno;
        balance = 0;
    }

    public void display() {
        System.out.println(accountNumber + " " + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(121, 20000);
        Account a3 = new Account(121);
        a1.display();
        a2.display();
        a3.display();
    }

}
