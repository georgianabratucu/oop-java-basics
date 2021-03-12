# 1. Encapsulation Exercise

##  1.1. Create new java class BankAccount with

```bash
fields: balance and limit 
type: double
access modifier: private
getters & setters
```

## 1.2. Create new java class EncapsulationTest with a main method

```bash
public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);

        System.out.println(bankAccount.getBalance());
    }
```
## 1.3. set value for the limit member
```bash
bankAccount.setLimit(20);
```
## 1.4. get the value for the limit member
```bash
System.out.println(bankAccount.getLimit());
```
## 1.5. run the main method

# 2. Composition Exercise

##  2.1. Create new java class Person with

```bash
fields: name and bankAccount 
type: String and BankAccount
access modifier: private
one constructor with 2 parameters (name, bankAccount)
a method:
    public String getBalance() {
        return "The balance of the person " + name + " is: " + bankAccount.getBalance() + " RON";
    }
```

## 3.2. Create new java class CompositionTest with a main method

```bash
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        Person person = new Person("ana", bankAccount);

        System.out.println(person.getBalance());
    }
```
## 2.3. run the main method

# 3. SINGLE Inheritance Exercise

##  3.1. Create new java class Student extends Person with

```bash
fields: college
type: String
access modifier: private
getter
```

## 3.2. Create new java class InheritanceTest with a main method

```bash
public static void main(String[] args) {
             BankAccount bankAccount = new BankAccount();
             bankAccount.setBalance(1000);
             Student student = new Student("ana", bankAccount, "CSIE");
             System.out.println(student.getBalance());
             System.out.println("Student college is: "+ student.getCollege());
    }
```

## 3.3. run the main 

# 4. MULTILEVEL Inheritance Exercise

##  4.1. Create new java class ForeignStudent extends Student with

```bash
fields: country
type: String
access modifier: private
getter
```

## 4.2. In the class InheritanceTest created above add in mai method

```bash
        ForeignStudent foreignStudent = new ForeignStudent("ana", bankAccount, "CSIE", "France");
        System.out.println(foreignStudent.getBalance());
        System.out.println("Foreign student college is: "+ foreignStudent.getCollege());
        System.out.println("Foreign student country is: "+ foreignStudent.getCountry());
```

## 4.3. run the main method

# 5. HIERARCHICAL Inheritance Exercise

##  5.1. Create new java class Teacher extends Person with

```bash
fields: position
type: String
access modifier: private
getter
```

## 5.2. In the class InheritanceTest created above add in mai method

```bash
        Student stud = new Student("Maria", bankAccount, "E-BUSINESS");
        System.out.println(stud.getBalance());
        System.out.println("Student college is: "+ stud.getCollege());

        Teacher teacher = new Teacher("Popescu", bankAccount, "Decan");
        System.out.println(teacher.getBalance());
        System.out.println("Teacher position is: "+ teacher.getPosition());
```

## 5.3. run the main method



