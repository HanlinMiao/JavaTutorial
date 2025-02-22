package org.example;

public class Teacher extends User implements Talk {
    @Override
    public void sayHello() {
        System.out.println("Hi there i am a teacher");
    }
}
