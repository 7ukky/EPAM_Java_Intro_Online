package by.epam.java_introduction.module3.simplest_class.simplest_class3;

public class StudentLogic {

    public boolean isExcellent(Student student) {

        int[] marks = student.getMarks();

        for (int mark : marks) {

            if (!(mark >= Student.EXCELLENT_MARK_MIN_VALUE && mark <= Student.EXCELLENT_MARK_MAX_VALUE)) {

                return false;

            }

        }

        return true;

    }

}
