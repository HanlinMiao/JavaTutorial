package org.example;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    public String output() {
        return "Hi my name is " + firstName + " " + lastName;
    }

    public String output(boolean nice){
        if (nice) {
            return "You are now Nice " + getFullName();
        } else {
            return "You are a freak " + getFullName();
        }
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
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

    public static void printUser(User u) {
        System.out.println(u.getFullName());
    }

    public static void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }

}
