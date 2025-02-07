package org.example;

import java.util.Scanner;

// everything is inside a class
// everything is a member of this class
// i.e. methods, variables
public class Main {
    // Class has methods with identifiers
    public static void main(String[] args) {
        System.out.println("What is your name?");

        // = is an assignment operator
        // type identifier = new type()
        // System.in is the source of the scanner
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String x = new String("hello");
        System.out.println("Hello " + name + " " + x);

    }
    String x = new String("hello"); // property
}

// class - contains everything has members
// methods - do something
// arguments - What you pass to a method; (part of the invocation of the method)
// parameter - variable that stores that data; (part of the definition)
// properties - store something
// access modifiers (public, private) - who can use these methods and classes
// static - No instance of class is needed
// object - instance of a class

// String[] args is an argument, "Hello world" is an argument

// literals - the value of the string
// variable - the container that stores some value
// expression - evaluates to a value
// operators - work on operands to produce a value
// operands - the thing(s) the operator works on