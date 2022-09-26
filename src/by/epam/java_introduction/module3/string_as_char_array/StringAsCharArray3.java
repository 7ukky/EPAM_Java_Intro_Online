package by.epam.java_introduction.module3.string_as_char_array;

// В строке найти количество цифр.

public class StringAsCharArray3 {

    public static void main(String[] args) {

        String text = "12jdf2nj 4 2jjdnsj2 df2212 3209 0.";
        int quantity;


        quantity = getDigitQuantity(text.toCharArray());
        System.out.println("В строке " + text + "\n" + quantity + " цифр(а).");

    }

    public static int getDigitQuantity(char[] text) {

        int counter = 0;

        for (char sym : text) {

            if (Character.isDigit(sym)) {

                counter++;

            }

        }

        return counter;

    }

}
