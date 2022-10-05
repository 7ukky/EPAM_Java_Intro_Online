package by.epam.java_introduction.module3.regular_expression;

// Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
// операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
// алфавиту.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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

        int selector;

        System.out.println("Изначальный текст: " );
        System.out.println(text);

        printMenu();
        while (true) {

            selector = getSelectedInt();

            switch (selector) {

                case 1 -> {

                    text = firstOption(text);
                    System.out.println("Результат операции: " );
                    System.out.println(text);
                    printMenu();

                }

                case 2 -> {

                    text = secondOption(text);
                    System.out.println("Результат операции: " );
                    System.out.println(text);
                    printMenu();

                }

                case 3 -> {

                    text = thirdOption(text, 'а');
                    System.out.println("Результат операции: " );
                    System.out.println(text);
                    printMenu();

                }

                case 4 -> System.exit(0);

                default -> System.out.println("Введённый пункт не существует");

            }

        }

    }

    public static void printMenu() {

        System.out.println("Выберите пункт меню: ");
        System.out.println("1) Отсортировать каждый обзац по кол-ву предложений в нём");
        System.out.println("2) Отсортировать слова в каждом предложении по длине");
        System.out.println("3) Отсортировать лексемы в каждом предложении убыванию количества вхождений заданного" +
                " символа, а в случае равенства – по  алфавиту");
        System.out.println("4) Выход");

    }

    public static int getSelectedInt() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {

            sc.next();
            System.out.println("Некорректный ввод");

        }

        return sc.nextInt();

    }

    // сортировка абзацев по количеству предложений
    public static String firstOption(String text) {

        String[] paragraphs = splitTextIntoParagraphs(text);
        String result;

        sortSentencesInParagraphsByNum(paragraphs);

        result = Arrays.toString(paragraphs);
        result = result.replaceAll("[\\[\\],]", "");

        return result;

    }

    // сортировка слов каждого предложения по длине
    public static String secondOption(String text) {

        String[] paragraphs = splitTextIntoParagraphs(text);
        String result;

        for (int i = 0; i < paragraphs.length; i++) {

            String[] sentences = splitParagraphIntoSentences(paragraphs[i]);

            for (int j = 0; j < sentences.length; j++) {

                sentences[j] = sortWordsInSentenceByLength(sentences[j]);

            }

            paragraphs[i] = Arrays.toString(sentences).replaceAll("[\\[\\],]", "");
            paragraphs[i] = "\t" + paragraphs[i] + "\n";

        }

        result = Arrays.toString(paragraphs);
        result = result.replaceAll("[\\[\\],]", "");

        return result;

    }

    // сортировка лексем предложения по убыванию количества вхождений заданного символа, а в случае равенства – по
    // алфавиту.
    public static String thirdOption(String text, char sym) {

        String[] paragraphs = splitTextIntoParagraphs(text);
        String result;

        for (int i = 0; i < paragraphs.length; i++) {

            String[] sentences = splitParagraphIntoSentences(paragraphs[i]);

            for (int j = 0; j < sentences.length; j++) {

                sentences[j] = sortWordsInSentenceByCharOccurrence(sentences[j], sym);

            }

            paragraphs[i] = Arrays.toString(sentences).replaceAll("[\\[\\],]", "");
            paragraphs[i] = "\t" + paragraphs[i] + "\n";

        }

        result = Arrays.toString(paragraphs);
        result = result.replaceAll("[\\[\\],]", "");

        return result;

    }

    public static String sortWordsInSentenceByCharOccurrence(String sentence, char sym) {

        String result;
        String finalMark;
        String[] words;

        finalMark = getFinalPunctuationMarkOfSentence(sentence);
        words = splitSentenceIntoWords(sentence);

        boolean needIteration;
        do {

            needIteration = false;

            for (int i = 1; i < words.length; i++) {

                int num1 = getNumOfOccurrencesOfChar(words[i - 1], sym);
                int num2 = getNumOfOccurrencesOfChar(words[i], sym);
                int resOfComp = words[i - 1].compareToIgnoreCase(words[i]);

                if (num1 < num2 || (num1 == num2 && resOfComp > 0) ) {

                    String buff = words[i];
                    words[i] = words[i - 1];
                    words[i - 1] = buff;

                    needIteration = true;

                }

            }

        } while (needIteration);

        result = Arrays.toString(words).replaceAll("[\\[\\],]", "");
        result += finalMark;
        return result;

    }

    public static String sortWordsInSentenceByLength(String sentence) {

        String result;
        String finalMark;
        String[] words;

        finalMark = getFinalPunctuationMarkOfSentence(sentence);
        words = splitSentenceIntoWords(sentence);

        boolean needIteration;
        do {

            needIteration = false;

            for (int i = 1; i < words.length; i++) {

                if (words[i].length() > words[i - 1].length()) {

                    String buff = words[i];
                    words[i] = words[i - 1];
                    words[i - 1] = buff;

                    needIteration = true;

                }

            }

        } while (needIteration);

        result = Arrays.toString(words).replaceAll("[\\[\\],]", "");
        result += finalMark;
        return result;

    }

    public static void sortSentencesInParagraphsByNum(String[] paragraphs) {

        boolean needIteration;
        do {

            needIteration = false;

            for (int i = 1; i < paragraphs.length; i++) {

                if (getSentencesNum(paragraphs[i]) > getSentencesNum(paragraphs[i - 1])) {

                    String buff = paragraphs[i];
                    paragraphs[i] = paragraphs[i - 1];
                    paragraphs[i - 1] = buff;

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

            paragraphsList.add(matcher.group());

        }

        return paragraphsList.toArray(new String[0]);

    }

    public static String[] splitParagraphIntoSentences(String paragraph) {

        ArrayList<String> sentencesList = new ArrayList<>();

        Pattern pattern = Pattern.compile("[^.\t]+[!?.]+");
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {

            sentencesList.add(matcher.group().trim());

        }

        return sentencesList.toArray(new String[0]);

    }

    public static String[] splitSentenceIntoWords(String sentence) {

        Pattern pattern = Pattern.compile("\\s*[^А-Яа-я-\\d]\\s*");

        return pattern.split(sentence);

    }

    public static int getNumOfOccurrencesOfChar(String source, char target) {

        int counter = 0;

        Pattern pattern = Pattern.compile(String.valueOf(target));
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {

            counter++;

        }

        return counter;

    }

    public static String getFinalPunctuationMarkOfSentence(String sentence) {

        Pattern pattern = Pattern.compile("[!?.]+$");
        Matcher matcher = pattern.matcher(sentence);

        if (matcher.find()) {

            return matcher.group();

        }

        return null;

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
