package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class LAB14AssignmentRunner {


    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        int accountNumber, choice, withdrawAmount, depositAmount, accountNumReci;
        boolean exist = false, existTrans = false;
        ArrayList<Account> acc1 = new ArrayList<>();
        acc1.add(new Account(1, 90000));
        acc1.add(new Account(5,25000));

        try {
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts", true));
            for (Account account : acc1) {
                act.writeObject(account);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        while (true) {
            System.out.println("-------Welcome to Swiss Bank ATM-------\n");
            System.out.print("Please enter your account number below (to exit press 0): -\n->");

            accountNumber = scan.nextInt();
            for (Account account : acc1) {
                if (account.getAccountNumber() == accountNumber) {
                    exist = true;
                    break;
                }
                else if (accountNumber == 0){
                    System.exit(1);
                }
            }
            while (true) {
                if (exist) {
                    System.out.println("Select an option below:- ");
                    System.out.println("1. Account inquiry");
                    System.out.println("2. WithDraw Cash");
                    System.out.println("3. Deposit Cash");
                    System.out.println("4. Transfer money");
                    System.out.println("0. Logout");
                    System.out.print("-->");
                    choice = scan.nextInt();
                    if (choice == 0) {
                        break;
                    }

                    switch (choice) {
                        case 1 -> balanceInquiry(accountNumber, acc1);
                        case 2 -> {
                            System.out.println("How much money you want to withdraw: ");
                            withdrawAmount = scan.nextInt();
                            withdraw(accountNumber, acc1, withdrawAmount);
                        }
                        case 3 -> {
                            System.out.println("How much money you want to Deposit: ");
                            depositAmount = scan.nextInt();
                            deposit(accountNumber, acc1, depositAmount);
                        }
                        case 4 -> {
                            System.out.println("Enter account number where you want to transfer: ");
                            accountNumReci = scan.nextInt();
                            for (Account account : acc1) {
                                if (account.getAccountNumber() == accountNumReci) {
                                    existTrans = true;
                                    break;
                                }
                            }
                            if (existTrans) {
                                transfer(accountNumber, accountNumReci, acc1);
                                System.out.println("Money successfully transfered");
                            } else
                                System.out.println("Reciving account doesnt exist");
                        }
                        default -> System.out.println("Wrong choice");
                    }
                } else {
                    System.out.println("Wrong account number");
                    break;
                }
            }
        }
    }

    public static void balanceInquiry(int accNo, ArrayList<Account> accs) {
        try {

            ObjectInputStream actInput = new ObjectInputStream(new FileInputStream("Accounts"));
            for (int i = 0; i < accs.size(); i++) {
                Account account = (Account) actInput.readObject();
                if (account.getAccountNumber() == accNo) {
                    System.out.println("Account Details");
                    System.out.println("Your account has following amount " + account.getBalance());
                }
            }
        } catch (EOFException ex) {
            System.out.println("End of file reached.");
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void withdraw(int accountNumber, ArrayList<Account> accounts, int withdrawAmount) {
        int totalAmount;
        try {
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));
            for (Account account : accounts) {

                if (account.getAccountNumber() == accountNumber) {
                    totalAmount = account.getBalance();
                    totalAmount -= withdrawAmount;
                    if (totalAmount > 0) {
                        account.setBalance(totalAmount);
                        System.out.println("Money is being deducted your new balance is: " + totalAmount);
                    } else {
                        System.out.println("You dont have enough money");
                    }
                }
            }
            for (Account account : accounts) {

                act.writeObject(account);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void deposit(int accountNumber, ArrayList<Account> accounts, int depositAmount) {
        int totalAmount;
        try {
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));

            for (Account account : accounts) {

                if (account.getAccountNumber() == accountNumber) {
                    totalAmount = account.getBalance();
                    totalAmount += depositAmount;
                    account.setBalance(totalAmount);
                    System.out.println("Money is being added your new balance is: " + totalAmount);

                }
            }
            for (Account account : accounts) {
                act.writeObject(account);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void transfer(int account1, int account2, ArrayList<Account> accounts) {
        Scanner scan = new Scanner(System.in);
        int tAmount, currentAmount;
        System.out.println("How much money do you want to transfer: ");
        tAmount = scan.nextInt();
        try {
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));
            for (Account account : accounts) {
                if (account.getAccountNumber() == account1) {
                    currentAmount = account.getBalance();
                    account.setBalance(currentAmount - tAmount);
                } else if (account.getAccountNumber() == account2) {
                    currentAmount = account.getBalance();
                    account.setBalance(currentAmount + tAmount);
                }
            }
            for (Account account : accounts) {
                act.writeObject(account);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
