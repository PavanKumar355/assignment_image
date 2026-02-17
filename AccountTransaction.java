package com.iispl.utility;

import java.util.Scanner;
import com.iispl.entity.Account;
import com.iispl.service.AccountService;

public class AccountTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = null;
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

             choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account = AccountService.createAccount();
                    displayAccount(account);
                    break;

                case 2:
                    account = AccountService.deposit();
                    displayAccount(account);
                    break;

                case 3:
                    account = AccountService.withdrawal();
                    displayAccount(account);
                    break;

                case 4:
                    displayAccount(account);
                    break;

                case 5:
                    System.out.println("Thank you for using banking system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    private static void displayAccount(Account account) {

        if (account == null) {
            System.out.println("No account created yet!");
            return;
        }

        System.out.println("------------ Account Details ------------");
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Bank Name: " + account.getBankName());
        System.out.println("Account Balance: " + account.getBalance());
    }
}
