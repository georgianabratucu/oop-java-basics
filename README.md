# OOP JAVA BASICS EXAMPLES

## 1. Create a new module with your firstname-lastname (ex: bratucu-georgiana)
```bash   
      Right click on oop-java-basic module -> New -> Module
      Select Maven
      Set JDK 1.8 as Module SDK
      Complete parent & name
```

## 2. Create the following packages starting from /src/main/java
```bash
- com
    - cegeka
        - academy
```
# 3. Encapsulation Exercise

## 3.1. Create a new package named encapsulation
## 3.2. Create new java class BankAccount with

```bash
fields: balance and limit 
type: double
access modifier: private
getters & setters
```

## 3.3. Create new java class EncapsulationTest with a main method

```bash
public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);

        System.out.println(bankAccount.getBalance());
    }
```
## 3.4. set value for the limit member
```bash
bankAccount.setLimit(20);
```
## 3.5. get the value for the limit member
```bash
System.out.println(bankAccount.getLimit());
```
## 3.6. run the main method

# 4. Composition Exercise

## 4.1. Create a new package named composition
## 4.2. Create new java class Person with

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

## 4.3. Create new java class CompositionTest with a main method

```bash
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        Person person = new Person("ana", bankAccount);

        System.out.println(person.getBalance());
    }
```
## 4.4. run the main method

# 5. SINGLE Inheritance Exercise

## 5.1. Create a new package named inheritance
## 5.2. Create new java class Student extends Person with

```bash
fields: college
type: String
access modifier: private
getter
```

## 5.3. Create new java class InheritanceTest with a main method

```bash
public static void main(String[] args) {
             BankAccount bankAccount = new BankAccount();
             bankAccount.setBalance(1000);
             Student student = new Student("ana", bankAccount, "CSIE");
             System.out.println(student.getBalance());
             System.out.println("Student college is: "+ student.getCollege());
    }
```

## 5.4. run the main 

# 6. MULTILEVEL Inheritance Exercise

## 6.1. Use the package created at step 5
## 6.2. Create new java class ForeignStudent extends Student with

```bash
fields: country
type: String
access modifier: private
getter
```

## 6.3. In the class InheritanceTest created above add in mai method

```bash
        ForeignStudent foreignStudent = new ForeignStudent("ana", bankAccount, "CSIE", "France");
        System.out.println(foreignStudent.getBalance());
        System.out.println("Foreign student college is: "+ foreignStudent.getCollege());
        System.out.println("Foreign student country is: "+ foreignStudent.getCountry());
```

## 6.4. run the main method

# 7. HIERARCHICAL Inheritance Exercise

## 7.1. Use the package created at step 5
## 7.2. Create new java class Teacher extends Person with

```bash
fields: position
type: String
access modifier: private
getter
```

## 7.3. In the class InheritanceTest created above add in mai method

```bash
        Student stud = new Student("Maria", bankAccount, "E-BUSINESS");
        System.out.println(stud.getBalance());
        System.out.println("Student college is: "+ stud.getCollege());

        Teacher teacher = new Teacher("Popescu", bankAccount, "Decan");
        System.out.println(teacher.getBalance());
        System.out.println("Teacher position is: "+ teacher.getPosition());
```

## 7.3. run the main method



