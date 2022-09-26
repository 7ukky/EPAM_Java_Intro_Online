package by.epam.java_introduction.module3.string_as_char_array;

//Замените в строке все вхождения 'word' на 'letter'.

public class StringAsCharArray2 {

    public static void main(String[] args) {

        String text = "I don't like the word unofficial. " +
                "He words his request in a particularly ironic way. " +
                "Wordwordwoord";

        System.out.println(replace(text, "word", "letter"));

    }

    public static String replace(String sourceString, String targetString, String sampleString) {

        char[] sourceChars = sourceString.toCharArray();
        char[] sampleChars = sampleString.toCharArray();
        char[] targetChars = targetString.toCharArray();

        char[] resultChars;

        int lengthDifference;
        int occurrencesQuantity;


        lengthDifference = sampleChars.length - targetChars.length;
        occurrencesQuantity = getOccurrencesQuantity(sourceChars, targetChars);

        resultChars = new char[sourceChars.length + lengthDifference * occurrencesQuantity];


        int replacementCounter = 0;

        for (int i = 0; i < sourceChars.length; i++) {

            boolean isMatch = true;
            for (int k = i, j = 0; j < targetChars.length; j++, k++) {

                if (!(sourceChars[k] == targetChars[j])) {

                    isMatch = false;
                    break;

                }

            }

            int correctionValue = lengthDifference * replacementCounter; // Значение для корректировка каретки
                                                                         // с учётом разницы длинн и
                                                                         //количества вхождений

            if (isMatch) {

                System.arraycopy(sampleChars, 0, resultChars, i + correctionValue, sampleChars.length);
                replacementCounter++;
                i += targetChars.length - 1;

            }
            else {

                resultChars[i + correctionValue] = sourceChars[i];

            }

        }

        return String.valueOf(resultChars);

    }

    public static int getOccurrencesQuantity(char[] sourceChars, char[] targetChars) {

        int targetsQuantity = 0;

        for (int i = 0; i < sourceChars.length; i++) {

            boolean isMatch = true;
            for (int k = i, j = 0; j < targetChars.length; k++, j++) {

                if (!(sourceChars[k] == targetChars[j])) {

                    isMatch = false;
                    break;

                }

            }

            if (isMatch) {

                targetsQuantity++;
                i += targetChars.length - 1;

            }

        }

        return targetsQuantity;

    }

}
