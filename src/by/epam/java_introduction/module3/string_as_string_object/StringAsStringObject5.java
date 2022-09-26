package by.epam.java_introduction.module3.string_as_string_object;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class StringAsStringObject5 {

    public static void main(String[] args) {

        String text = "Подсчитать, сколько раз среди символов заданной строки встречается буква.";

        System.out.println("В строке \"" + text + "\" обнаружен(о) " + getNumOfOccurrences(text, "а") + " символов \"а\"");

    }

    public static int getNumOfOccurrences(String text, String sym) {

        String diff = text.replace(sym, "");

        return text.length() - diff.length();

    }

}
