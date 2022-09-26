package by.epam.java_introduction.module3.string_as_string_object;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class StringAsStringObject1 {

    public static void main(String[] args) {

        String text = " 1Space   3Space      6Space  2Space";
        int maxSpaceRowSize;


        maxSpaceRowSize = getMaxSpaceRowSize(text);
        System.out.println("Наибольшее количество подряд идущих пробелов в тексте: " + maxSpaceRowSize);

    }

    public static int getMaxSpaceRowSize(String text) {

        int maxSize = 0;

        for (int i = 0; i < text.length(); i++){

            int j = i;
            int buff = 0;

            while (j < text.length() && text.charAt(j) == ' ') {

                buff++;
                j++;

            }

            if (buff > maxSize) {

                maxSize = buff;

            }

            i += buff;

        }

        return maxSize;

    }

}
