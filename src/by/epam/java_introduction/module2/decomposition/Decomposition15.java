package by.epam.java_introduction.module2.decomposition;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 6789). Для решения задачи использовать декомпозицию.

public class Decomposition15 {


    public static void main(String[] args) {

        int n = 4;

        printNumbers(n);

    }


    public static void printNumbers(int n) {

        int j;
        int limit;


        limit = (int) Math.pow(10, n);

        for (j = (int) Math.pow(10, n - 1); j < limit; j++) {

            if (isAscendingSequence(j)) {

                System.out.print(j + " ");

            }

        }

    }


    public static boolean isAscendingSequence(int num) {

        int buff;
        int temp;

        temp = num;
        buff = temp % 10 + 1;

        while (temp != 0) {

            if (temp % 10 == buff - 1) {

                buff = temp % 10;
                temp /= 10;

            }

            else {

                return false;

            }

        }

        return true;

    }

}
