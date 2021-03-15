package com.cegeka.academy.inheritance;

import com.cegeka.academy.encapsulation.BankAccount;

public class InheritanceTest {

    public static void main(String[] args) {

        //SINGLE
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        Student student = new Student("ana", bankAccount, "CSIE");
        System.out.println(student.getBalance());
        System.out.println("Student college is: "+ student.getCollege());

        //MULTILEVEL
        ForeignStudent foreignStudent = new ForeignStudent("ana", bankAccount, "CSIE", Country.FR);
        System.out.println(foreignStudent.getBalance());
        System.out.println("Foreign student college is: "+ foreignStudent.getCollege());
        System.out.println("Foreign student country is: "+ foreignStudent.getCountry());

        //HIERARCHICAL
        Student stud = new Student("Maria", bankAccount, "E-BUSINESS");
        System.out.println(stud.getBalance());
        System.out.println("Student college is: "+ stud.getCollege());

        Teacher teacher = new Teacher("Popescu", bankAccount, "Decan");
        System.out.println(teacher.getBalance());
        System.out.println("Teacher position is: "+ teacher.getPosition());
    }
}
