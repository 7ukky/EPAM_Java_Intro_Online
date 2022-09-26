package by.epam.java_introduction.module3.string_as_string_object;

// В строке вставить после каждого символа 'a' символ 'b.

public class StringAsStringObject2 {


    public static void main(String[] args) {

        String text = "Pan Pineapple Apple Pan";

        System.out.println(modifyString(text));

    }

    public static String modifyString(String text) {

        return text.replace("a", "ab");

    }

}
