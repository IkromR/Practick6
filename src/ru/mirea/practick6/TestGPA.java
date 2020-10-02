package ru.mirea.practick6;

public class TestGPA {
    public static void main(String[] args) {
        // write your code here
        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        //Student[] students = {new Student(2), new Student(1)};
        SortingStudentsByGPA.gPASort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
