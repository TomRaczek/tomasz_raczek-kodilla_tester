package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void shouldReturnCorrectTeacherName() {
        Teacher teacherJosh = new Teacher("Josh");
        Student jerry = new Student("Jerry", teacherJosh);
        Application.getTeacherName(jerry);
        assertEquals("Josh", Application.getTeacherName(jerry));
    }
    @Test
    public void shouldReturnOptionalTeacherName() {
        Student jake = new Student("Jake", null);
        Application.getTeacherName(jake);
        assertEquals("<undefined>", Application.getTeacherName(jake));
    }
}