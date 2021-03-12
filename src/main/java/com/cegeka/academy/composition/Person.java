package com.cegeka.academy.composition;

import com.cegeka.academy.encapsulation.BankAccount;

public class Person {

    private String name;
    private BankAccount bankAccount;

    public Person(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getBalance() {
        return "The balance of the person " + name + " is: " + bankAccount.getBalance() + " RON";
    }
}
