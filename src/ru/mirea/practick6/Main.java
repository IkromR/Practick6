package ru.mirea.practick6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};

        SortingStudentsByGPA.gPASort(students, 0, students.length - 1);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
