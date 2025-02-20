package org.example;

import java.util.List;
import java.util.Objects;

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

    public static int searchUser(List<User> users, User user) {
        return searchUser(users, user.getFullName());
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

    public static User findUser(List<User> users, User user) {
        for (User u : users){
            if(u.equals(user))  {
                return u;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
