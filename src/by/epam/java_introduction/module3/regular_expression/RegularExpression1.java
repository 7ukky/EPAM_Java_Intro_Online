package by.epam.java_introduction.module3.regular_expression;

// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
// операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
// алфавиту.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {

    public static void main(String[] args) {

            String text = "\tОднажды гуляла я по лесу. Наступила осень, листва на деревьях окрасилась в яркие цвета. " +
                "Тревожно гудели птицы на озере: скоро наступят холода, пора бы уже улететь, чтобы в следующем году " +
                "вернуться сюда вновь.\n" +
                "\tТишину в лесу прерывали только редкие птичьи голоса и шелест ветра по сухим листам. Внезапно, " +
                "я остановилась, услышав “тук-тук”. Я пошла на звук, но, как только я дошла до дерева, по котором " +
                "стучал невидимый лесной барабанщик, звук раздался уже на другом стволе, словно неведимка решил " +
                "поиграть со мной в догонялки. Очередное предложение?\n" +
                "\tЯ обошла дерево по кругу, недоумевая, кто же стал причиной шума...\n";

        System.out.println(sortParagraphs(text));

    }

    public static String sortParagraphs (String text) {

        String[] paragraphs = splitTextIntoParagraphs(text);
        sortBySentencesNum(paragraphs);

        return Arrays.toString(paragraphs);

    }

    public static void sortSentences(String text) {}

    public static void sortBySentencesNum(String[] strings) {

        boolean needIteration;

        do {

            needIteration = false;

            for (int i = 1; i < strings.length; i++) {

                if (getSentencesNum(strings[i]) > getSentencesNum(strings[i - 1])) {

                    String buff = strings[i];
                    strings[i] = strings[i - 1];
                    strings [i - 1] = buff;

                    needIteration = true;

                }

            }

        } while (needIteration);

    }

    public static String[] splitTextIntoParagraphs(String text) {

        List<String> paragraphsList = new ArrayList<>();

        Pattern pattern = Pattern.compile("\t.+\n");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            String paragraph = text.substring(matcher.start(), matcher.end());
            paragraphsList.add(paragraph);

        }

        return paragraphsList.toArray(new String[0]);

    }

    public static int getSentencesNum(String paragraph) {


        Pattern pattern = Pattern.compile("[А-Я].+?[!?.]");
        Matcher matcher = pattern.matcher(paragraph);

        int sentencesNum = 0;

        while (matcher.find()) {

            sentencesNum++;

        }

        return sentencesNum;

    }

}
