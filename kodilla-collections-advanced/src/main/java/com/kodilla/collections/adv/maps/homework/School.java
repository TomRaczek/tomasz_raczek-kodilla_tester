package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, List<Integer> students) {
        this.students = students;
        this.schoolName = schoolName;
    }
    public int getAllStudents() {
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public String getSchoolName() {
        return schoolName;
    }
}
