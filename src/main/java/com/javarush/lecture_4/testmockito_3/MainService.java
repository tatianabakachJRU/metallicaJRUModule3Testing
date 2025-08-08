package com.javarush.lecture_4.testmockito_3;

import com.javarush.lecture_4.testmockito_3.DependencyService;

public class MainService {
    private final DependencyService dependencyService;

    public MainService(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }

    public String concatStrings(){
        return dependencyService.getMessage() + " | " + dependencyService.someMethod();
    }

    public int calculateSum(int firstNumber, int secondNumber) {
        return dependencyService.calculate(firstNumber, secondNumber);
    }

    public String executeWithLogging(){
        dependencyService.logActions("Executing with logging");
        return dependencyService.getMessage();
    }

}
