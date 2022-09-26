package by.epam.java_introduction.module3.string_as_string_object;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class StringAsStringObject6 {

    public static void main(String[] args) {

        String text = "Из заданной строки получить новую, повторив каждый символ дважды.";

        System.out.println(duplicateSymbols(text));

    }


    public static String duplicateSymbols(String text) {

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {

            result.append(text.charAt(i)).append(text.charAt(i));

        }

        return String.valueOf(result);

    }

}
