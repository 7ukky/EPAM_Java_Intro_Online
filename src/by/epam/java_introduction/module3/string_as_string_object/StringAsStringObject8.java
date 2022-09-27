package by.epam.java_introduction.module3.string_as_string_object;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
// длинных слов может быть несколько, не обрабатывать.

public class StringAsStringObject8 {

    public static void main(String[] args) {

        String text = "Найти самое длинное слово и вывести его на экран";

        System.out.println("Самое длинное слово в строке: " + getLongestWord(text));

    }

    public static String getLongestWord(String text) {

        String[] splitText = text.split(" ");
        String longestWord = " ";

        for (String str: splitText) {

            if (str.length() > longestWord.length()) {

                longestWord = str;

            }

        }

        return longestWord;

    }

}
