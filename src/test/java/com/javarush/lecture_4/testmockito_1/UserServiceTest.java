package com.javarush.lecture_4.testmockito_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void shouldReturnRealUserWhenFetchingUserFromRealRepository() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String realUser = null;
        assertEquals("Javarush", realUser);
    }

    @Test
    void shouldReturnMockUserWhenFetchingUserFromMockRepository() {
        UserRepository userRepositoryMock = mock(UserRepository.class);
        when(userRepositoryMock.getUser()).thenReturn("Mock User");

        UserService userService = new UserService(userRepositoryMock);

        String mockUser = userService.getUser();
        assertEquals("Mock User", mockUser);
    }
}