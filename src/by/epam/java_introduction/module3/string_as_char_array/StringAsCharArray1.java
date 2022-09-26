package by.epam.java_introduction.module3.string_as_char_array;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class StringAsCharArray1 {

    public static void main(String[] args) {


        String[] names = {"camelCase", "arrayLength", "startIndex"};


        for (String str : toSnakeCase(names)) {

            System.out.println(str);

        }

    }

    public static String[] toSnakeCase(String[] array) {


        String[] resultArray = new String[array.length];


        for (int i = 0; i < array.length; i++) {

            char[] camelCaseChars = array[i].toCharArray();
            char[] snakeCaseChars = new char[array[i].length() + 1]; // + 1 к длинне т. к. в snake_case добавляется знак _

            int indexOfCapital;

            indexOfCapital = getIndexOfCapital(camelCaseChars);

            System.arraycopy(camelCaseChars, 0, snakeCaseChars, 0, indexOfCapital);
            snakeCaseChars[indexOfCapital] = '_';
            snakeCaseChars[indexOfCapital + 1] = Character.toLowerCase(camelCaseChars[indexOfCapital]);

            if (camelCaseChars.length + 1 - (indexOfCapital + 2) >= 0) {

                System.arraycopy(camelCaseChars, indexOfCapital + 1,
                        snakeCaseChars, indexOfCapital + 2,
                        camelCaseChars.length - indexOfCapital - 1);

            }

            resultArray[i] = String.valueOf(snakeCaseChars);

        }

        return resultArray;

    }

    public static int getIndexOfCapital(char[] array) {

        int indexOfCapital = 0;

        for (int j = 0; j < array.length; j++) {

            if (Character.isUpperCase(array[j])) {

                indexOfCapital = j;

            }

        }

        return indexOfCapital;

    }

}
