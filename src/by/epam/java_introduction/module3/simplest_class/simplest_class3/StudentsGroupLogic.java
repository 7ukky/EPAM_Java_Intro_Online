package by.epam.java_introduction.module3.simplest_class.simplest_class3;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroupLogic {

    private final StudentLogic studentLogic = new StudentLogic();

    public List<Student> getExcellentStudents(StudentsGroup group) {

        Student[] students = group.getStudentsList();
        List<Student> excellentStudents = new ArrayList<>();

        for (Student student : students) {

            if (student != null) {

                if (studentLogic.isExcellent(student)) {

                    excellentStudents.add(student);

                }

            }

        }

        return excellentStudents;

    }

}
