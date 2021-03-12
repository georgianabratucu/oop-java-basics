package com.cegeka.academy.composition;

import com.cegeka.academy.encapsulation.BankAccount;

public class CompositionTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        Person person = new Person("ana", bankAccount);
        System.out.println(person.getBalance());
    }
}
