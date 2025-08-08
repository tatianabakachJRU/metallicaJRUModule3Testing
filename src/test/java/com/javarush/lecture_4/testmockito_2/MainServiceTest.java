package com.javarush.lecture_4.testmockito_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MainServiceTest {
    @Mock
    private DependencyService dependencyService;

    @Test
    public void shouldReturnMockedValueExecuteIsCalled(){
        when(dependencyService.methodFromDependencyService()).thenReturn("mockedValue");
        MainService mainService = new MainService(dependencyService);
        String result = mainService.methodFromMainService();
        assertEquals("mockedValue", result);
    }
}