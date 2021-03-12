package com.cegeka.academy.inheritance;

import com.cegeka.academy.composition.Person;
import com.cegeka.academy.encapsulation.BankAccount;

public class Teacher extends Person {

    private String position;

    public Teacher(String name, BankAccount bankAccount, String position) {
        super(name, bankAccount);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
