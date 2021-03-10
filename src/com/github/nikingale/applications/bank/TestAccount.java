package com.github.nikingale.applications.bank;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class TestAccount {

    public static void main(String[] args) {
        CreateAccount myAccount = new CreateAccount(101, "Nikhil Ingale", 100.0f, 123);
        myAccount.getMenu();
    }

}