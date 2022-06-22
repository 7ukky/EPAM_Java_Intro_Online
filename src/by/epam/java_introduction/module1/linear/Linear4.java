package by.epam.java_introduction.module1.linear;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
// дробную и целую части числа и вывести полученное значение числа.

public class Linear4 {


    public static void main(String[] args) {

        double r = 103.060;

        double temp1;
        double temp2;

        temp1 = Math.floor(r) / 1000;
        temp2 = Math.round((r - Math.floor(r)) * 1000);
        r = temp1 + temp2;

        System.out.println("Результат перестановки местами целой и дробной частей числа: " + r);

    }

}
