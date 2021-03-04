package com.github.nikingale.applications.bank;

public class TestAccount {

    public static void main(String[] args) {
        CreateAccount myAccount = new CreateAccount(101, "Nikhil Ingale", 100.0f, 123);
        myAccount.getMenu();
    }

}