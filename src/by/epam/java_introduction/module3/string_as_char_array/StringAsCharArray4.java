package by.epam.java_introduction.module3.string_as_char_array;

// В строке найти количество чисел.

public class StringAsCharArray4 {

    public static void main(String[] args) {

        String text = "f1 1 dsf1 11f";

        int quantity;

        quantity = getNumberQuantity(text.toCharArray());
        System.out.println("В строке " + text + "\n" + quantity + " чисел(ло).");

    }

    public static int getNumberQuantity(char[] text) {

        int counter = 0;

        for (int i = 0; i < text.length; i++) {

            boolean isMatch = false;
            int j = i;

            while (j < text.length) {

                if (Character.isDigit(text[j])) {

                    isMatch = true;
                    j++;

                }
                else {

                    break;

                }

            }

            if (isMatch) {

                counter++;
                i += j - i;

            }

        }

        return counter;

    }

}
