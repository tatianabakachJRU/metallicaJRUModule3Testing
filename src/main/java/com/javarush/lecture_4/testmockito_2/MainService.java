package com.javarush.lecture_4.testmockito_2;

public class MainService {
    private final DependencyService dependencyService;

    public MainService(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }

    public String methodFromMainService() {
        return dependencyService.methodFromDependencyService();
    }
}
