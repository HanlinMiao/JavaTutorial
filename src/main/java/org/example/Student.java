package org.example;

public class Student extends User {
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello() {
        System.out.println("Hello I am a Student. And my major is " + major);
    }
}
