package by.epam.java_introduction.module3.string_as_string_object;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
// def", то должно быть выведено "abcdef".

public class StringAsStringObject7 {

    public static void main(String[] args) {

        String text = "abc cde def";

        System.out.println(deleteDuplicatesAndSpaces(text));

    }

    public static String deleteDuplicatesAndSpaces(String source) {

        String text;

        text = source.replaceAll(" ", "");

        for (int i = 0; i < text.length(); i++) {

            String sym;
            int pos;

            sym = String.valueOf(text.charAt(i));
            pos = text.indexOf(sym);

            text = text.substring(0, pos + 1) + text.substring(pos).replace(sym, "");

        }

        return text;

    }

}
