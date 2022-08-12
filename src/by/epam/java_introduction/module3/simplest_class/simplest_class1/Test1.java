package by.epam.java_introduction.module3.simplest_class.simplest_class1;


public class Test1 {

    private int a;
    private int b;


    public Test1(int a, int b) {

        this.a = a;
        this.b = b;

    }


    public void setA(int a) {

        this.a = a;

    }

    public void setB(int b) {

        this.b = b;

    }


    public void printA() {

        System.out.println("Значение поля A: " + a);

    }

    public void printB() {

        System.out.println("Значение поля B: " + b);

    }


    public int getSum() {

        return a + b;

    }


    public int getMax() {

        return a > b ? a : b;

    }

}
