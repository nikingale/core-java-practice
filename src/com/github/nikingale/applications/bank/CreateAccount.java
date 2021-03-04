package com.github.nikingale.applications.bank;

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