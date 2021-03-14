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
          -java
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
Obs: balance cannot be smaller than 0
```

## 3.3. Create new java class EncapsulationTest with a main method

```bash
public static void main(String[] args) {

}
```

## 3.4. Create new instance of the encapsulated class

```bash
BankAccount bankAccount = new BankAccount();
```

## 3.5. Set value for the balance member

```bash
bankAccount.setBalance(1000);
```

## 3.6. Get the value for the balance member

```bash
System.out.println(bankAccount.getBalance());
```
## 3.6. Run the main method


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
    
}
```
## 4.4. Create new instance of the BankAccount class and set value for the balance member 

```bash
BankAccount bankAccount = new BankAccount();
bankAccount.setBalance(1000);
```

## 4.5. Create new instance of the Person class
```bash
Person person = new Person("John", bankAccount);
``` 

## 4.4. Call the method getBalance() and run the main method
```bash
System.out.println(person.getBalance());
```


# 5. SINGLE Inheritance Exercise

## 5.1. Create a new package named inheritance
## 5.2. Create new java class Student extends Person with

```bash
fields: college
type: String
access modifier: private
constructor with all parameters
getter
```

## 5.3. Create new java class InheritanceTest with a main method

```bash
public static void main(String[] args) {

}
```
## 5.4. Create new instance of the BankAccount class and set value for the balance member 

```bash
BankAccount bankAccount = new BankAccount();
bankAccount.setBalance(1000);
```

## 5.5. Create new instance of the Student class 

```bash
Student student = new Student("John", bankAccount, "CSIE");
```

## 5.6. Call the method getBalance() from the parent class Person
```bash
System.out.println(student.getBalance());
```

## 5.7. Call the method getCollege()
```bash
System.out.println("Student college is: "+ student.getCollege());
```


# 6. MULTILEVEL Inheritance Exercise

## 6.1. Use the package created at step 5
## 6.2. Create new enum Country with values:

```bash
IT, FR, RO
```

## 6.3. Create new java class ForeignStudent extends Student with

```bash
fields: country
type: Country
access modifier: private
create a constructor with all parameters
getter
```

## 6.4. In the class InheritanceTest created above, in the main method, create new instance of class ForeignStudent

```bash
ForeignStudent foreignStudent = new ForeignStudent("ana", bankAccount, "CSIE", "France");
```

## 6.5. Call the method getBalance() from the parent class Person
```bash
System.out.println(foreignStudent.getBalance());
```

## 6.6. Call the method getCollege() from the parent class Student
```bash
System.out.println("Foreign student college is: "+ foreignStudent.getCollege());
```

## 6.7. Call the method getCountry()
```bash
System.out.println("Foreign student country is: "+ foreignStudent.getCountry());
```


# 7. HIERARCHICAL Inheritance Exercise

## 7.1. Use the package created at step 5
## 7.2. Create new java class Teacher extends Person with

```bash
fields: position
type: String
access modifier: private
create constructor with all parameters
getter
```

## 7.3. In the class InheritanceTest created above, in main method, create a new instance of class Teacher

```bash
Teacher teacher = new Teacher("Popescu", bankAccount, "Decan");
System.out.println("Teacher position is: "+ teacher.getPosition());
```

## 7.4. Call the method getBalance() from the parent class Person
```bash
System.out.println(teacher.getBalance());
```

## 7.5. Call the method getPosition()
```bash
System.out.println("Teacher position is: "+ teacher.getPosition());
```


# 8. Dynamic Polymorphism - method overriding Exercise

## 8.1. Create a new package named polymorphism
## 8.2. Create new java class Animal with a method

```bash
public void eat() {
        System.out.println("Animals can eat");
    }
```

## 8.3. Create new java class Cat extends Animal which override eat() method for superclass

```bash
    @Override
    public void eat() {
        System.out.println("Cats can eat");
    }
```

## 8.4. Create new java class PolymorphismTest with a main method
```bash
public static void main(String[] args) {

}
```

## 8.5. Create new instance of the Animal class - animal reference and object
```bash
Animal animal = new Animal();
```

## 8.6. Create new instance of the Cat class - animal reference but cat object
```bash
Animal cat = new Cat();
```

## 8.6. Call method eat() for both objects created above
```bash
animal.eat();
cat.eat();
```


# 9. Static Polymorphism - method overloading Exercise
## 9.1. In the package polymorphism, create a new java class Calculator with two methods
```bash
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
```
## 9.2. Create new instance of the Calculator class
```bash
Calculator calculator = new Calculator();
```

## 9.3. Call method with 2 parameters
```bash
calculator.add(10, 20);
```

## 9.3. Call method with 3 parameters
```bash
calculator.add(10, 20, 30);
```


# 10. Abstraction
## 10.1. Create new abstract class named Shape with
```bash
fields: color
type: String
access modifier: private
constructor with parameters
an abstract method: public abstract double area();
a concrete method:  
public void getColor() {
    System.out.println("Shape color is " + color);
}
```

## 10.2. Create new concrete class named Square extends Shape with
```bash
fields: length
type: double
access modifier: private
constructor with all parameters
override the method area() from parent:
@Override
    public double area() {
        return length * length;
    }
```

## 10.3. Create a new instance of the Square
```bash
Shape shape = new Square("Red", 8.1);
```

## 10.4. Call area() and getColor() methods
```bash
System.out.println(shape.area());
shape.getColor();
```

## 10.5. Create a new interface Drawable with
```bash
method: void draw();
```

## 10.6. Modify the class Square created earlier to implements Drawable interface
```bash
public class Square extends Shape implements Drawable
```

## 10.7. In class Square override the method from interface

```bash
public void draw() {

        System.out.println("Drawing a square");

        for(int i = 0; i < Math.round(length); i++) {
            for(int j = 0; j < Math.round(length); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
```

## 10.8. In the main class AbstractionTest create a new instance of Square
```bash
Drawable square = new Square("Green", 4.7);
```

## 10.9. Call the method draw()
```bash
square.draw();
```




