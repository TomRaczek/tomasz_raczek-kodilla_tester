package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890_-.", "123"})
    public void shouldReturnTrueIfUsernameIsCorrect(String correctInput) {
        boolean result = validator.validateUsername(correctInput);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"", "1", "23", "@#$$%", "> < < > >", "      ", "*//-*+"})
    public void shouldReturnFalseIfUsernameIsIncorrect(String falseInput) {
        boolean result = validator.validateUsername(falseInput);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"test@test.test","t_e-s.t@test.test", "1234@1234.test","t@t.t"})
    public void shouldReturnTrueIfEmailIsCorrect(String correctEmail) {
        boolean result = validator.validateEmail(correctEmail);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"test@test","@test","1234@1234.1234","@test.test", "test@@test.test",
            "test@t-e_s.t.test","test@test.t_e-s.t","$%^@test.test","test@$%^.test", "test@test.%^&*", "test@.",
            "test@", "tęst@test.test","test@tęst.test", "test@test.tęst"})
    public void shouldReturnFalseIfEmailIsIncorrect(String incorrectEmail) {
        boolean result = validator.validateEmail(incorrectEmail);
        assertFalse(result);
    }
}