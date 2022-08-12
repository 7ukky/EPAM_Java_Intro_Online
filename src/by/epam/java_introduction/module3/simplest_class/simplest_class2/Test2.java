package by.epam.java_introduction.module3.simplest_class.simplest_class2;


public class Test2 {


    private int x;
    private int y;

    private static final int DEFAULT_VALUE_X = 1;
    private static final int DEFAULT_VALUE_Y = 1;


    public Test2() {

        x = DEFAULT_VALUE_X;
        y = DEFAULT_VALUE_Y;

    }


    public Test2(int x, int y) {

        this.x = x;
        this.y = y;

    }


    public void setX(int x) {

        this.x = x;

    }


    public int getX() {

        return x;

    }


    public void setY(int y) {

        this.y = y;

    }


    public int getY() {

        return y;

    }

}
