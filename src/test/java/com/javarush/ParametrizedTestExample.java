package com.javarush;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParametrizedTestExample {

    enum Color {RED, BLUE, GREEN};

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testWithValueSource(int value) {
        assertEquals(0, value % 2);
    }

    @ParameterizedTest
    @EnumSource(Color.class)
    public void testWithEnumSource(Color color) {
        assertNotNull(color);
    }


}
