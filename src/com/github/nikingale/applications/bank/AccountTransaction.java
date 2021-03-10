package com.github.nikingale.applications.bank;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class AccountTransaction implements Comparable {

    private float transactionAmount;
    private TransactionType transactionType;

    public AccountTransaction(float transactionAmount, TransactionType transactionType) {
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "₹" + transactionAmount + " " + transactionType;
    }

    @Override
    public int compareTo(Object o) {
        float amount1 = this.transactionAmount;
        AccountTransaction transaction = (AccountTransaction) o;
        float amount2 = transaction.transactionAmount;

        if (amount1 < amount2) {
            return +1;
        }
        else if (amount1 > amount2) {
            return -1;
        }
        else return 0;
    }

}