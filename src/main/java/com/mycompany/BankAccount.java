package com.mycompany;

public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.printf("Successfully deposited: %.2f\n", amount);
            
        }
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.printf("Successfully withdrew: %.2f\n", amount);
            return true;
        }
        else 
        {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }
}

