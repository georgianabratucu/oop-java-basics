package com.cegeka.academy.inheritance;

import com.cegeka.academy.composition.Person;
import com.cegeka.academy.encapsulation.BankAccount;

public class Student extends Person {

    private String college;

    public Student(String name, BankAccount bankAccount, String college) {
        super(name, bankAccount);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }
}
