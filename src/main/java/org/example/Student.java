package org.example;

public class Student extends User implements Talk {
    public boolean verified = true;
    public String major;


    // default constructor
    public Student() {
        System.out.println("Creating a new Student");
    }

    public Student(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
}
