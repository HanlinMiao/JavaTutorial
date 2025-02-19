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
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
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

    public static int searchUser(List<User> users, String firstName, String lastName) {
        return searchUser(users, firstName + " " + lastName);
    }

    public static int searchUser(List<User> users, String fullName) {
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getFullName().equals(fullName))  {
                return i;
            }
        }
        return -1;
    }

}
