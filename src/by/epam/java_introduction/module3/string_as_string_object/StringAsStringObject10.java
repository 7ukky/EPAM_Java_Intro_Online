package by.epam.java_introduction.module3.string_as_string_object;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

public class StringAsStringObject10 {

    public static void main(String[] args) {

        String text = "Предложение 1! Предложение 2. Предложение 3? Предложение четыре! ";

        System.out.println("В строке \"" + text + "\":\n" + getNumOfSentences(text) + " предложений(я)");

    }

    public static int getNumOfSentences(String text) {

        String buff;
        buff = text.replace("!", "").replace("?", "").replace(".", "");

        return text.length() - buff.length();

    }

}
