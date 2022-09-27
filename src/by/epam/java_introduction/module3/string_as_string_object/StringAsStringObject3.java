package by.epam.java_introduction.module3.string_as_string_object;

// Проверить, является ли заданное слово палиндромом.

public class StringAsStringObject3 {

    public static void main(String[] args) {

        String[] lines = {"Топот", "шалаш", "121", "Палиндром", "level"};

        for (String line: lines) {

            System.out.println("Строка " + line + (isPalindrome(line) ? " является" : " не является") + " палиндромом");

        }

    }


    public static boolean isPalindrome(String line) {

        StringBuilder reverseLine = new StringBuilder(line.toLowerCase()).reverse();

        return String.valueOf(reverseLine).equalsIgnoreCase(line);

    }

}
