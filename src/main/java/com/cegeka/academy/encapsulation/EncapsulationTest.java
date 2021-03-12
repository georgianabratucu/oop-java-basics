package com.cegeka.academy.encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
//creating instance of the encapsulated class
        BankAccount bankAccount = new BankAccount();
//setting value for the balance member
        bankAccount.setBalance(1000);
        bankAccount.setLimit(20);
//getting value of the balance member
        System.out.println(bankAccount.getLimit());
    }
}
