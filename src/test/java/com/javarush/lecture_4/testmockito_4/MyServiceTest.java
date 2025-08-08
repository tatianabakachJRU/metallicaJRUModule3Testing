package com.javarush.lecture_4.testmockito_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyServiceTest {

    @Test
    public void shouldAnswerWhenMethodWithDifferentParameters() {
        MyService myServiceMock = mock(MyService.class);
        when(myServiceMock.sayHello("Anna")).thenReturn("Hello Anna");
        when(myServiceMock.sayHello("Petr")).thenReturn("Hello Petr");
        when(myServiceMock.sayHello("Maria")).thenReturn("Hello Maria");

        String anna = myServiceMock.sayHello("Anna");
        String petr = myServiceMock.sayHello("Petr");
        String maria = myServiceMock.sayHello("Maria");

        assertEquals("Hello Anna", anna);
        assertEquals("Hello Petr", petr);
        assertEquals("Hello Maria", maria);

    }



}