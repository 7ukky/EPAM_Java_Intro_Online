package by.epam.java_introduction.module3.simplest_class.simplest_class1;


public class Main {

    public static void main(String[] args) {

        Test1 x = new Test1(1, 2);

        x.printA();
        x.printB();

        System.out.println("Большее значение: " + x.getMax());
        System.out.println("Сумма значений полей: " + x.getSum());

        x.setA(-25);
        x.setB(25);

        x.printA();
        x.printB();

        System.out.println("Большее значение: " + x.getMax());
        System.out.println("Сумма значений полей: " + x.getSum());

    }

}
