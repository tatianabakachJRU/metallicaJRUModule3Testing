package com.javarush.lecture_4.testmockito_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CatServiceTest {
    @Mock
    private CatRepository catRepository;

    @Test
    public void testCreateCatWhenUseAnyParameter() {
        CatService catService = new CatService(catRepository);
        Cat barsik = new Cat("Barsik");
        Cat marsik = new Cat("Marsik");
        catService.createCat(barsik);
        catService.createCat(marsik);
        //verify(catRepository).save(any(Cat.class));
        verify(catRepository, times(2)).save(any(Cat.class));
    }

    @Test
    public void testCreateCatWhenUseBarsikParameter() {
        CatService catService = new CatService(catRepository);
        Cat barsik = new Cat("Barsik");
        doAnswer(invocationOnMock -> {
            Cat argument = invocationOnMock.getArgument(0);
            assertEquals("Barsik", argument.getName());
            return null;
        }).when(catRepository).save(any(Cat.class));
    }
}