package com.javarush.lecture_4.testmockito_5;

public class CatService {
    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public void createCat(Cat cat) {
        catRepository.save(cat);
    }

    public Cat getCat(String name) {
        return catRepository.getByName(name);
    }
}
