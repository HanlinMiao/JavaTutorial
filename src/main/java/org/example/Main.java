package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

// everything is inside a class
// everything is a member of this class
// i.e. methods, variables
public class Main {
    // Class has methods with identifiers

    public static final double PI = 3.14159; // property
    private int x = 10; // We can use getter and setter

    public static void main(String[] args) {
        System.out.println("What is your name?");

        // = is an assignment operator
        // type identifier = new type()
        // System.in is the source of the scanner
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println(input);

        int input = scanner.nextInt();
        System.out.println(input);

        int result = input + 10;
        System.out.println(result);

        String x = new String("hello");

        // BigDecimal is more precise than regular double or floating point numbers
        BigDecimal money = scanner.nextBigDecimal();
        System.out.println(money);

        // primitive type
        int y = 5; // primitive value
        // object similar to the primitive type
        Integer z = 5; // object (5 is autoboxed)

        int i = 5; // 2-step process
        // variable creation
        // 1. declare
        // 2. Initialize

        int j;
        j = 5; // initialization
        j = 10; // J can be changed

        final int X = 5; // Initializing a constant
        double t = Main.PI;

        int a = 434343; // int has a size of 32 bits
        long l = 213123121232132L; // long has a size of 64 bits
        boolean isPizza = true;
        byte b = 'C'; // 8 bits -> ASCII table allows number and letters to be store in a byte object
        char c = 'Z'; // allows us to store Unicode characters 16 bits
        short s = -32768; // short is a small number 16 bits

        float f = 20.5f; // float is 32 bit use float when you are super restricted in memory
        double d = 20.5; // double is 64 bit

    }
}
// primitive types - boolean, byte, char, short, int, long, float, double
// objects - instances of a class (given the data type)

// data type: How the computer interprets the data.
// Java is statically type language: we need to specify the type of the variables upfront
// dynamically typed = variables do not have types

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