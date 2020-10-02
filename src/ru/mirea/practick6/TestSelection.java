package ru.mirea.practick6;

public class TestSelection {
    public static void main(String[] args) {

        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};

        Sorting.selectionSort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
