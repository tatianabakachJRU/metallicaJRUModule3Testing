package com.javarush.lecture_4.testmockito_3;

import com.javarush.lecture_4.testmockito_3.DependencyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MainServiceTest {
    @Spy
    private DependencyService dependencyService;

    @InjectMocks
    private MainService mainService;

    @Test
    public void shouldReturnMixedRealAndMockedValuesWhenUsingSpy(){
        when(dependencyService.getMessage()).thenReturn("Mocked Value");

        String concatResult = mainService.concatStrings();

        int sumResult = mainService.calculateSum(3, 5);

        assertEquals("Mocked Value | JavaRush", concatResult);
        assertEquals(8, sumResult);
    }

    @Test
    public void shouldReturnMockedValueAndSuppliesLoggingWhenLogMethodUseDoReturn(){
        Mockito.doReturn("Mocked Value").when(dependencyService).getMessage();

        Mockito.doNothing().when(dependencyService).logActions(anyString());

        String result = mainService.executeWithLogging();

        assertEquals("Mocked Value", result);

        verify(dependencyService).logActions("Executing with logging");
    }

}