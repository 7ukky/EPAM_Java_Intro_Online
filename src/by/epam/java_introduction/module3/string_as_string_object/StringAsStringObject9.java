package by.epam.java_introduction.module3.string_as_string_object;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class StringAsStringObject9 {

    public static void main(String[] args) {

        String text = "Иностранец сказал: \"Such a good day!\"";

        System.out.println("В строке \"" + text + "\" обнаружено:");
        System.out.println(getNumOfEngUpperCaseLetters(text) + " английских заглавных букв;");
        System.out.println(getNumOfEngLowerCaseLetters(text) + " английских строчных букв.");

    }

    public static int getNumOfEngUpperCaseLetters(String text) {

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {

                counter++;

            }

        }

        return counter;

    }

    public static int getNumOfEngLowerCaseLetters(String text) {

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);

            if (letter >= 'a' && letter <= 'z') {

                counter++;

            }

        }

        return counter;

    }

}
