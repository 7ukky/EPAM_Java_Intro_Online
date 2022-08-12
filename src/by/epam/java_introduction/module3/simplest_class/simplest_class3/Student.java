package by.epam.java_introduction.module3.simplest_class.simplest_class3;

public class Student {

    public static final int MARK_MAX_VALUE = 10;
    public static final int MARK_MIN_VALUE = 1;

    public static final int EXCELLENT_MARK_MAX_VALUE = 10;
    public static final int EXCELLENT_MARK_MIN_VALUE = 9;

    private String name;
    private String groupName;
    private int[] marks;


    public Student(String name, String groupName, int[] marks) {

        this.name = name;
        this.groupName = groupName;
        this.marks = marks;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public int getMark(int index) {

        if (index >= 0 && index < marks.length) {

            return marks[index];

        } else {

            return -1;

        }

    }

    public void setMark(int mark, int index) {

        if (index >= 0 && index < marks.length) {

            if (mark >= MARK_MIN_VALUE && mark <= MARK_MAX_VALUE) {

                marks[index] = mark;

            }

        }

    }

}
