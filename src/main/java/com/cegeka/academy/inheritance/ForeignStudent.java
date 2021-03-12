package com.cegeka.academy.inheritance;

import com.cegeka.academy.encapsulation.BankAccount;

public class ForeignStudent extends Student {

    private String country;

    public ForeignStudent(String name, BankAccount bankAccount, String college, String country) {
        super(name, bankAccount, college);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
