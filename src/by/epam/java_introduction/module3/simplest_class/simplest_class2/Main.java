package by.epam.java_introduction.module3.simplest_class.simplest_class2;


public class Main {

    public static void main(String[] args) {

        Test2 object1 = new Test2();
        Test2 object2 = new Test2(20, 10);

        System.out.println("Поля первого объекта (конструктор по умолчанию): " + object1.getX() + " " + object1.getY());
        System.out.println("Поля второго объекта: " + object2.getX() + " " + object2.getY());

        object1.setX(15);
        object1.setY(-15);

        System.out.println("Поля первого объекта после изменения: " + object1.getX() + " " + object1.getY());

    }

}