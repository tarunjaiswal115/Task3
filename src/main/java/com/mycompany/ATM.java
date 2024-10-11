package com.mycompany;
import java.util.Scanner;

public class ATM
{
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void showMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while (choice != 4);
        scanner.close();
    }

    private void checkBalance()
    {
        System.out.printf("Your current balance is: %.2f\n", account.getBalance());
    }

    private void deposit(Scanner scanner) 
    {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.printf("Your updated balance is: %.2f\n", account.getBalance());
        
    }

    private void withdraw(Scanner scanner)
    {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.printf("Your updated balance is: %.2f\n", account.getBalance());
        
    }
}

