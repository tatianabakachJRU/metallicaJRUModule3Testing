package com.javarush.lecture_4.testmockito_5;

public interface CatRepository {
    void save(Cat cat);
    Cat getByName(String name);
}
