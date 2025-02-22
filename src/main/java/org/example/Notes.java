package org.example;

public class Notes {

    // Object-Oriented Programming
    // Classes and Objects
    // class Person --> blueprint
    //  name variable : name is a field
    //  talk() method

    // Object is from instantiating a class

    // Access modifier public vs private
    // private String name
    // getter and setter
    // It will only allow the user to access private attributes through methods

    // methods define some type of behaviors

    // Encapsulation

    // Intro to static methods
    // The methods can be invoked from the class itself and you do not have to create instances of a class for it.

    // Method overloading

    // public void test(int x)
    // public void test(String x)

    // Method overriding
    // Replacing a method in a subclass/derived class

    // Pass by value, pass by reference
    // Primitive object is passed by value
    // Custom object is passed by reference

    // "Virtual" in Java
    // You do not have to type virtual, it is implicit
    // Most methods will be virtual by default
    // static, private methods are not virtual

    // Abstract makes the class `uninstantiable`.
    // User newUser = new User() will throw an error.

    // Abstract methods cannot have a method body
    // Forces the subclass to implement the abstract method from the parent class.
    // The type Student must implement the inherited abstract method User.sayHello()

    // Polymorphism
    //      Person
    // Student Teacher

    // Intro to constructors
    // Just a method, something we invoke, and no return type
    // we use the new keyword to invoke the constructor
    // need to explicitly declare a default constructor and a custom constructor

    // Interfaces
    // Defines the behaviors that the class needs

    // class extends a class
    // class implements an interface

    // final methods keyword
    // final basically means that the method cannot be overriden further down the inheritance hierarchy

    // final class
    // final means that the class cannot be extended further. No subclass can inherit this class.
}
