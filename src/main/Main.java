package main;
import bank.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolder = "John Doe";
        account.balance = 1000.0;

        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Account holder: " + account.accountHolder );
        System.out.println("Account balance: " + account.balance);
    }
}

/* This solution consists of two packages, bank and main. In the bank package,
* there is a BankAccount class with three fields: accountNumber, accountHolder,
* and balance. In the main package, there is a Main class with a main method
* that creates a BankAccount object and sets some values for the fields. Then,
* it prints the account details.*/