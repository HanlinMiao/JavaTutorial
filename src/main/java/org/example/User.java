package org.example;

public class User {
    public String firstName;
    public String lastName;

    public String output() {
        return "Hi my name is " + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
