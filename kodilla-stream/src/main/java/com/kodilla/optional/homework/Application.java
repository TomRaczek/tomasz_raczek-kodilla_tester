package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacherJosh = new Teacher("Josh");
        Teacher teacherJenny = new Teacher("Jenny");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jake", null));
        students.add(new Student("Jerry", teacherJosh));
        students.add(new Student("Jacob", teacherJenny));

        for (Student student : students) {
            String undefined = getTeacherName(student);
            System.out.println("Student " + student.getName() + " - " + undefined);
        }
    }
    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String undefined =
                optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return undefined;
    }
}