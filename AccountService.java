package com.iispl.service;

import java.util.Scanner;
import com.iispl.entity.Account;

public class AccountService {

    static Scanner sc = new Scanner(System.in);
    static Account account;  // store single account

    // Create Account
    public static Account createAccount() {

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        account = new Account(accountNumber, accountHolderName,
                phoneNumber, bankName, initialBalance);

        return account;
    }

    // Deposit
    public static Account deposit() {

        if (account == null) {
            System.out.println("Create account first!");
            return null;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        account.setBalance(account.getBalance() + amount);

        System.out.println("Amount deposited successfully!");
        return account;
    }

    // Withdrawal
    public static Account withdrawal() {

        if (account == null) {
            System.out.println("Create account first!");
            return null;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance!");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount withdrawn successfully!");
        }

        return account;
    }
}
