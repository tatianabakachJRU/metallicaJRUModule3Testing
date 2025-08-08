package com.javarush.lecture_4.testmockito_1;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUser(){
        return userRepository.getUser();
    }
}
