package by.epam.java_introduction.module3.simplest_class.simplest_class3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentsGroup group = new StudentsGroup(10);

        StudentsGroupLogic studentsGroupLogic = new StudentsGroupLogic();

        List<Student> excellentStudents;

        group.add(new Student("Yuriy Chickro", "MS-58", new int[] {9, 9, 9, 9, 9}));
        group.add(new Student("Anna May", "MS-58", new int[] {5, 7, 8, 7, 9}));
        group.add(new Student("Lisa Belova", "MS-58", new int[] {10, 9, 10, 9, 7}));
        group.add(new Student("Andrew Kholodich", "MS-58", new int[] {9, 10, 10, 9, 9}));
        group.add(new Student("Yuriy Chickro", "MS-58", new int[] {9, 5, 4, 6, 5}));
        group.add(new Student("Daniil Moldunov", "MS-58", new int[] {4, 4, 4, 5, 4}));
        group.add(new Student("Michail Muravey", "MS-58", new int[] {9, 10, 9, 10, 9}));
        group.add(new Student("Darya Sinyak", "MS-58", new int[] {10, 9, 10, 9, 10}));
        group.add(new Student("Oleg Zubor", "MS-58", new int[] {6, 10, 10, 9, 9}));
        group.add(new Student("Yuriy Chiraq", "MS-58", new int[] {5, 5, 5, 6, 6}));

        excellentStudents = studentsGroupLogic.getExcellentStudents(group);

        printStudentsList(excellentStudents);

    }

    public static void printStudentsList(List<Student> students) {

        for (Student student : students) {

            System.out.println(student.getName() + " " + student.getGroupName());

        }

    }

}
