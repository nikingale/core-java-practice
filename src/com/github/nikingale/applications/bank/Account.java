package com.github.nikingale.applications.bank;

import java.util.*;
import java.lang.*;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class Account {

    private int accountNumber;
    private String accountName;
    private float accountBalance;
    private int accountPassword;
    private List<AccountTransaction> transactionList = new LinkedList();

    public Account(int accountNumber, String accountName, float accountBalance, int accountPassword) {
        setAccountNumber(accountNumber);
        setAccountName(accountName);
        setAccountBalance(accountBalance);
        setAccountPassword(accountPassword);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getAccountPassword() {
        return accountPassword;
    }

    boolean isValid(int accountPassword) {
        return getAccountPassword() == accountPassword;
    }

    void displayAccount() {
        System.out.println("\nAccount Number = " + accountNumber + "\nAccount Holder = " + accountName + "\nAccount Balance = ₹" + accountBalance);
    }

    void printBalance() {
        System.out.println("Total Balance = ₹" + accountBalance);
    }

    void depositAmount(float amount) {
        if (amount != 0.0) {
            accountBalance = accountBalance + amount;
            System.out.println("\n₹" + amount + " deposited.");

            printBalance();
            AccountTransaction transaction = new AccountTransaction(amount, TransactionType.DEPOSIT);
            if (transaction.getTransactionAmount() != 0.0) {
                transactionList.add(transaction);
            }
        }
        else {
            System.out.println("Enter valid amount!");
        }
    }

    void withdrawAmount(float amount) {
        if (amount != 0.0) {
            if (accountBalance < amount) {
                System.out.println("\nInsufficient Balance!");
            }
            else {
                accountBalance = accountBalance - amount;
                System.out.println("\n₹" + amount + " withdrawn.");
                printBalance();
            }
            AccountTransaction transaction = new AccountTransaction(amount, TransactionType.WITHDRAWAL);
            transactionList.add(transaction);
        }
        else {
            System.out.println("Enter valid amount!");
        }
    }

    public int getTotalTransactions() {
        return transactionList.size();
    }

    public float getTotalDepositedAmount() {
        float result = 0;

        for (AccountTransaction transaction : transactionList) {
            if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
                result += transaction.getTransactionAmount();
            }
        }
        return result;
    }

    public float getTotalWithdrawnAmount() {
        float result = 0;

        for (AccountTransaction transaction : transactionList) {
            if (transaction.getTransactionType() == TransactionType.WITHDRAWAL) {
                result += transaction.getTransactionAmount();
            }
        }
        return result;
    }

    public void heavyTransactions() {
        int heavyTransactionsCount = 0;
        for (AccountTransaction transaction : transactionList) {
            if (transaction.getTransactionAmount() > 50000) {
                System.out.println(transaction);
                heavyTransactionsCount++;
            }
        }
        if (heavyTransactionsCount == 0) {
            System.out.println("No Heavy Transactions");
        }
    }

    public void printPassBook() {
        if (getTotalTransactions() == 0) {
            System.out.println("No Transactions");
            return;
        }

        System.out.println("\nPassbook-");
        for (int index = 0; index < transactionList.size(); index++) {
            AccountTransaction transaction = transactionList.get(index);
            System.out.println((index + 1) + ". " + transaction);
        }
    }

    public void printSortedPassBook() {
        System.out.println("\nSorted Passbook (Decreasing Amount Order)-");
        transactionList.sort(AccountTransaction::compareTo);
        for (int i = 0; i < transactionList.size(); i++) {
            System.out.println((i + 1) + ". " + transactionList.get(i));
        }
    }

}