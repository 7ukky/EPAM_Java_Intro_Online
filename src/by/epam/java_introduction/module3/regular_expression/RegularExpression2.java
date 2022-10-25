package by.epam.java_introduction.module3.regular_expression;

// Дана строка, содержащая текст (xml-документ).
// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
// тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
// нельзя.

import java.util.ArrayList;
import java.util.regex.*;

public class RegularExpression2 {

    public static void main(String[] args) {

        String xml = """
                <notes>
                    <note id = "1">
                        <to>Вася</to>
                        <from>Света</from>
                        <heading>Напоминание</heading>
                        <body>Позвони мне завтра!</body>
                    </note>
                    <note id = "2">
                        <to>Петя</to>
                        <from>Маша</from>
                        <heading>Важное напоминание</heading>
                        <body/>
                    </note>
                </notes>""";


        analyze(parseToStringArray(xml));

    }


    public static String[] parseToStringArray(String xml) {

        Pattern p  = Pattern.compile("\n");
        String[] xmlLines = p.split(xml);
        ArrayList<String> nodes = new ArrayList<>();

        for (int i = 0; i < xmlLines.length; i++) {

            String str = xmlLines[i];
            xmlLines[i] = str.trim();

        }

        Pattern fullPattern = Pattern.compile("^(<[^</>]+>)(?:([^</>]+)(</[^</>]+>))?$");
        Pattern bodilessTagPattern = Pattern.compile("^(<[^</>]+/>)$");
        Pattern closeTagPattern = Pattern.compile("^(</[^</>]+>)$");

        Matcher matcher;

        for (String line: xmlLines) {

            matcher = fullPattern.matcher(line);
            if (matcher.find()) {

                addParsedLineToList(matcher, nodes);
                continue;

            }

            matcher = bodilessTagPattern.matcher(line);
            if (matcher.find()) {

                addParsedLineToList(matcher, nodes);
                continue;

            }

            matcher = closeTagPattern.matcher(line);
            if (matcher.find()) {

                addParsedLineToList(matcher, nodes);

            }

        }

        return nodes.toArray(new String[0]);

    }

    public static void addParsedLineToList(Matcher matcher, ArrayList<String> list) {

        for (int i = 1; i <= matcher.groupCount(); i++) {

            if (matcher.group(i) != null) {

                list.add(matcher.group(i));

            }

        }

    }

    public static void analyze(String[] tags) {

        for (String tag: tags) {

            System.out.println(getTagName(tag));

        }

    }

    public static String getTagName(String tag) {

        if(isOpeningTag(tag)) {

            return "Открывающий тег:\n" + tag + "\n";

        }
        if (isBodilessTag(tag)) {

            return "Тег без тела:\n" + tag + "\n";

        }
        else if (isClosingTag(tag)) {

            return "Закрывающий тег:\n" + tag + "\n";

        }
        else {

            return "Содержимое тега:\n" + tag + "\n";

        }

    }

    private static boolean isOpeningTag(String tag) {

        Pattern pattern = Pattern.compile("^<[^</>]+>$");
        Matcher matcher = pattern.matcher(tag);

        return matcher.matches();

    }

    public static boolean isClosingTag(String tag) {

        Pattern pattern = Pattern.compile("^</[^</>]+>$");
        Matcher matcher = pattern.matcher(tag);

        return matcher.matches();

    }

    public static boolean isBodilessTag(String tag) {

        Pattern pattern = Pattern.compile("^<[^</>]+/>$");
        Matcher matcher = pattern.matcher(tag);

        return matcher.matches();

    }

}
