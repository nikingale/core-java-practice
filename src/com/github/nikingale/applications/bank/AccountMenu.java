package com.github.nikingale.applications.bank;

import java.util.Scanner;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class AccountMenu {

    public void menu(Account account) {

        Scanner scan = new Scanner(System.in);

        int choice = 0;

        while (choice != 11) {

            System.out.println("\nThe Account Menu---");
            System.out.println("Press 1 to get Account Info" +
                    "\nPress 2 to Deposit Amount" +
                    "\nPress 3 to Withdraw Amount" +
                    "\nPress 4 to Check Balance" +
                    "\nPress 5 to get Total Deposited Amount" +
                    "\nPress 6 to get Total Withdrawn Amount" +
                    "\nPress 7 to get Total Transactions" +
                    "\nPress 8 to print Passbook" +
                    "\nPress 9 to see Heavy Transactions" +
                    "\nPress 10 to print Sorted Passbook" +
                    "\nPress 11 to Exit");

            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    account.displayAccount();
                    break;


                case 2:
                    System.out.println("Enter Amount to be Deposited-");
                    float depositAmount = scan.nextFloat();
                    account.depositAmount(depositAmount);
                    break;


                case 3:
                    System.out.println("Enter Password-");
                    if (account.isValid(scan.nextInt())) {
                        System.out.println("Enter Amount to be Withdrawn-");
                        float withdrawAmount = scan.nextFloat();
                        account.withdrawAmount(withdrawAmount);
                    }
                    else System.out.println("Wrong Password! Try Again");
                    break;


                case 4:
                    account.printBalance();
                    break;


                case 5:
                    System.out.println("\nTotal Deposited Amount = ₹" + account.getTotalDepositedAmount());
                    break;


                case 6:
                    System.out.println("\nTotal Withdrawn Amount = ₹" + account.getTotalWithdrawnAmount());
                    break;


                case 7:
                    System.out.println("\nTotal Transactions = " + account.getTotalTransactions());
                    break;


                case 8:
                    account.printPassBook();
                    break;


                case 9:
                    account.heavyTransactions();
                    break;

                case 10:
                    account.printSortedPassBook();
                    break;

                case 11:
                    System.out.println("\nExiting Program...");
                    break;

                default:
                    System.out.println("Enter Valid Choice!");
            }

        }

    }

}