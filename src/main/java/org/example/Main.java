package org.example;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.*;

// everything is inside a class
// everything is a member of this class
// i.e. methods, variables
public class Main {
    // Class has methods with identifiers
    public static void main(String[] args) { // method
        String[] firstNames = {"John", "Jane", "Bob", "Jamie"};
        String[] lastNames = {"Doe", "Doe", "Dylan", "Lione"};
        List<User> users = new ArrayList<>();

        for (int i = 0; i < firstNames.length; i++) {
            User newUser = new User();
            newUser.setFirstName(firstNames[i]);
            newUser.setLastName(lastNames[i]);
            users.add(newUser);
        }

        for (User user : users) {
            System.out.println(user.getFullName());
        }
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


//        // icu
//        // Initialization
//        // Comparison/Condition
//        // Update
//
//        String password = "let me in";
//        Scanner scanner = new Scanner(System.in);
//        String guess;
//        do {
//                System.out.println("Guess the password: ");
//        guess = scanner.nextLine();
//        } while (!guess.equals(password));
//
//        System.out.println("Congrats you are in.");
//        scanner.close(); // free the memory of the scanner

//        System.out.println("What's your name?");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        // Switch statement compares exact values
//        // Whereas if statements can be ranges
//        switch (name) {
//        case "Caleb":
//        case "John":
//        System.out.println("Welcome my man!");
//                break;
//                        case "Clare":
//                        System.out.println("Go away");
//                break;
//        default:
//        System.out.println("Try again later");
//                break;
//                        }

//        System.out.println("How old are you?");
//        Scanner scanner = new Scanner(System.in);
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("Cats or dogs?");
//        String animal = scanner.nextLine();
//
//        /* comparison operators
//         * == equality
//         * != inequality
//         * < less than
//         * > greater than
//         * <= less than or equal to
//         * >= greater than equal to
//         */
//
//        /* logical operators
//         * && and
//         * || or
//         * ! not
//         */
//
//        if (age > 12 && animal.equals("dogs")) { // comparison operator (similar to ==)
//        System.out.println("Welcome !");
//        } else if (animal.equals("cats")) {
//        System.out.println("Welcome cat lover");
//        }

//        String password = "let me in";
//        System.out.println("Please enter your password: ");
//
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        System.out.println(password.equals(input));
//
//        if (password.equals(input)) {
//        // code to execute if true
//        System.out.println("Your password is correct");
//        } else if ("don't stop believing".equals(input)) {
//        System.out.println("Your got the secret password");
//        } else {
//                // code to execute if false
//                System.out.println("Your password is incorrect. Please try again");
//        }
//                System.out.println("This is always going to run");

//        System.out.println(password == input);
//
//        // Primitives "==" this works
//        // Objects "==" this does not work; this is comparing the memory locations of the objects
//        // Values of the objects is a reference to the object
//
//        String a = "hi";
//        String b = "hi";
//        System.out.println(a == b); // true; string interning; "hi" value is interned, the same values are sharing the same memory location
//
//        int x = 10;
//        int y = 10;
//        System.out.println(x == y);

//        String fullAd = "yummmm...my oh my chicken pot pie. Now with 20% more chicken\n";
//        System.out.println(fullAd.toUpperCase());
//        System.out.println(fullAd.toLowerCase());
//        System.out.println(fullAd.strip());
//        int beginIndex = 9;
//        System.out.println(fullAd.stripLeading());
//        System.out.println(fullAd.substring(9, 17)); // beginIndex is inclusive and the endIndex is exclusive
//        System.out.println(fullAd.repeat(300));
//        System.out.println(fullAd.equals("hello"));
//
//        String password = "let me in";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess the password: ");
//        String input = scanner.nextLine();
//        System.out.println(input.equals(password));
//        String x = "yummmm...my oh my chicken pot pie";
//        int index = x.length() - 1;
//        System.out.println(x.charAt(index));
//
//        String fullAd = x + " Now with 20% more chicken";
//        System.out.println(fullAd);
//        System.out.println(fullAd.contains("chicken"));
//        System.out.println(fullAd.indexOf("my"));
//        System.out.println(fullAd.indexOf("my", fullAd.indexOf("my")+1));
//        System.out.println(fullAd.lastIndexOf("my"));
//        String x = "hello cats"; // Object (instance of a class)
//        System.out.println(x.charAt(0));
//        System.out.println(x + " and dogs");
//        x += " and puppies";
//        System.out.println(x);
//        String name = "Caleb";
//        System.out.printf("hello %s%n", name);
//        System.out.println(name.length());
//        int x = 10;
//        int y = 20;
//        System.out.println(Integer.max(x, y));
//        System.out.println(Integer.compare(x, y));
//
//        String money = "300";
//        System.out.println(Integer.valueOf(money));
//        System.out.println(Integer.parseInt(money));
//        Integer a = Integer.valueOf(money);
//        int b = Integer.parseInt(money);
//        double x = 5.0 / 2;
//        int a = 5;
//        double y = (double) a / 2;
//        System.out.println(x);
//        System.out.println(y);
//
//        int remainder = a % 2;
//        System.out.println(remainder);
//
//        // Precedence; math order evaluated, and it is left to right
//
//        int i = 5;
//        int j = i++; // i is assigned to j and i gets incremented
//        System.out.println(i); // 6
//        System.out.println(j); // 5
//
//        int k = 5;
//        int l = ++k; // k gets incremented first and then k is assigned to l
//        System.out.println(k); // 6
//        System.out.println(l); // 6
//        public static final double PI = 3.14159; // property
//        private int x = 10; // We can use getter and setter
//        System.out.println("What is your name?");
//
//        // = is an assignment operator
//        // type identifier = new type()
//        // System.in is the source of the scanner
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println(input);
//
//        int input = scanner.nextInt();
//        System.out.println(input);
//
//        int result = input + 10;
//        System.out.println(result);
//
//        String x = new String("hello");
//
//        // BigDecimal is more precise than regular double or floating point numbers
//        BigDecimal money = scanner.nextBigDecimal();
//        System.out.println(money);
//
//        // primitive type
//        int y = 5; // primitive value
//        // object similar to the primitive type
//        Integer z = 5; // object (5 is autoboxed)
//
//        int i = 5; // 2-step process
//        // variable creation
//        // 1. declare
//        // 2. Initialize
//
//        int j;
//        j = 5; // initialization
//        j = 10; // J can be changed
//
//        final int X = 5; // Initializing a constant
//        double t = Main.PI;
//
//        int a = 434343; // int has a size of 32 bits
//        long l = 213123121232132L; // long has a size of 64 bits
//        boolean isPizza = true;
//        byte b = 'C'; // 8 bits -> ASCII table allows number and letters to be store in a byte object
//        char c = 'Z'; // allows us to store Unicode characters 16 bits
//        short s = -32768; // short is a small number 16 bits
//
//        float f = 20.5f; // float is 32 bit use float when you are super restricted in memory
//        double d = 20.5; // double is 64 bit

//        System.out.println(Double.NaN); // NaN
//        System.out.println(Math.sqrt(-1)); // NaN
//        System.out.println(Double.isNaN(Math.sqrt(-1))); // NaN
//        System.out.println(Math.pow(99999, 999999999)); // infinity
//        System.out.println(Math.pow(-99999, 999999999)); // - infinity