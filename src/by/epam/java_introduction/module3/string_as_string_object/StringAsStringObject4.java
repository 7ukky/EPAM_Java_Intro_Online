package by.epam.java_introduction.module3.string_as_string_object;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class StringAsStringObject4 {

    public static void main(String[] args) {

        String line = "информатика";

        String result = line.substring(7, 8) + line.substring(3, 4) + line.substring(4,5) + line.substring(7, 8);

        System.out.println(result);

    }

}
