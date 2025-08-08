package com.javarush.lecture_4.testmockito_3;

public class DependencyService {
    public String getMessage() {
        return "Hello World";
    }

    public String someMethod() {
        return "JavaRush";
    }

    public int calculate(int a, int b) {
        return a + b;
    }

    public void logActions(String message) {
        System.out.println("Logging: " + message);
    }
}
