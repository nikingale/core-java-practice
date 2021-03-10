package com.github.nikingale.applications.bank;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class CreateAccount {

    Account account;
    AccountMenu accountMenu = new AccountMenu();

    public CreateAccount(int accountNumber, String accountName, float accountBalance, int accountPassword) {
        account = new Account(accountNumber, accountName, accountBalance, accountPassword);
    }

    public void getMenu() {
        accountMenu.menu(account);
    }

}