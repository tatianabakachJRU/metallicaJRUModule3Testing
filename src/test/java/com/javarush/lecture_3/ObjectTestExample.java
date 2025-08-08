package com.javarush.lecture_3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ObjectTestExample {

    @Test
    @Order(1)
    @DisplayName("Тест проверяет строку на null")
    void shouldReturnNullWhenStringIsNull() {
        String string = null;
        assertNull(string);
    }

    @Test
    @Order(2)
    void shouldNotBeSameWhenStringsAddFromNew() {
        String string1 = new String("Value");
        String string2 = new String("Value");

        assertNotSame(string1, string2);
    }

    @Test
    @Order(3)
    void shouldValidateAllCondition() {
        String string = "Value";
        assertAll(
                () -> assertEquals(5, string.length()),
                () -> assertTrue(string.startsWith("V")),
                () -> assertFalse(string.endsWith("V"))
        );
    }
}
