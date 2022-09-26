package by.epam.java_introduction.module3.string_as_char_array;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class StringAsCharArray5 {

    public static void main(String[] args) {

        String text = "            I don't     like the woooord      unofficial.     ";
        String result = deleteSurplusSpaces(text.toCharArray());

        System.out.println(result);

    }


    public static String deleteSurplusSpaces(char[] text) {

        int length;
        length = text.length - getSpacesQuantity(text) + getSpaceOccurrencesQuantity(text);


        char[] buff = new char[length];
        char[] result = new char[buff.length - 2];

        boolean isSpaceFound = true;

        for (int i = 0, j = 0; i < text.length; i++) {

            if (text[i] == ' ') {

                if (isSpaceFound) {

                    isSpaceFound = false;
                    buff[j] = text[i];
                    j++;

                }

            }
            else {

                isSpaceFound = true;
                buff[j] = text[i];
                j++;

            }

        }

        System.arraycopy(buff, 1, result, 0, result.length);

        return String.valueOf(result);

    }

    public static int getSpacesQuantity(char[] text) {

        int counter = 0;

        for (char sym : text) {

            if (sym == ' ') {

                counter++;

            }

        }

        return counter;

    }

    public static int getSpaceOccurrencesQuantity(char[] text) {

        int counter = 0;

        for (int i = 0; i < text.length; i++) {

            int j = i;
            boolean isMatch = false;

            while (j < text.length) {

                if (text[j] == ' ') {

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
