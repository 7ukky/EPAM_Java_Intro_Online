package by.epam.java_introduction.module3.simplest_class.simplest_class3;

public class StudentsGroup {

    private Student[] students;
    private int realGroupSize;

    public StudentsGroup(int size) {

        students = new Student[size];
        realGroupSize = 0;

    }


    public boolean add(Student newStudent) {

        if (realGroupSize >= students.length) {

            return false;

        }

        students[realGroupSize] = newStudent;
        realGroupSize++;
        return true;

    }


    public Student[] getStudentsList() {

        return students;

    }

    public void setStudentsList(Student[] students) {

        this.students = students;

    }


    public Student getStudent(int index) {

        if (index >= 0 && index < students.length) {

            return students[index];

        }

        else {

            return null;

        }

    }

    public void setStudent(Student student, int index) {

        if (index >= 0 && index < students.length) {

            students[index] = student;

        }

    }

}
