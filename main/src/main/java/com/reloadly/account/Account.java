package com.reloadly.account;

public class Account {

    private final int accountNumber;
    private double money;

    public Account(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void transfer(Account transferTo, double amount) {
        synchronized (transferTo) {
            synchronized (this) {
                transferTo.money += amount;
                this.money -= amount;
            }
        }
    }
}
