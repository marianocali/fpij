package main.fpij.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RangeLowerAndUpperCase {

    final static List<String> listStrings = Arrays.asList("123", "abc", "e78DR", "lh", "TEC", " ", "dream", "43EFdf",  null, "a1#");
    static String regex = "[a-zA-Z]*";


    public static void main(String[] args) {
//        rangeLowerAndUpperCaseExample();
//        rangeLowerAndUpperCaseExample("1234abcD");

//        filterLowerAndUpperCase("1234ab$c7D=g%t#ds2");
        filterLowerAndUpperCaseFromList(listStrings);
        filterLowerAndUpperCaseFromList2(listStrings);
    }


    public static void rangeLowerAndUpperCaseExample() {
        String regex = "[a-zA-Z]";
        String text = "Two Uppercase alphabets 34 overall";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeLowerAndUpperCaseExample(String text) {
        String regex = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    //given a String return only lowerCase and upperCase characters
    public static void filterLowerAndUpperCase(String text) {
        String result = text.replaceAll("[^a-zA-Z]", "");

        System.out.print("original text: " + text + "\n" + "filter text: " + result);
    }

    //receive a list of Strings and return only Strings that are lower and upperCase refuse any String with digits or non alphabetic character
    //Example
    public static void filterLowerAndUpperCaseFromList(List<String> list) {
        System.out.println("input list: " + list);
        System.out.print("filterLowerAndUpperCaseFromList: ");
        Pattern pattern = Pattern.compile(regex);
        List<String> matching = list.stream()
                .filter(Objects::nonNull)
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());
        System.out.println(matching);
    }

    public static void filterLowerAndUpperCaseFromList2(List<String> list) {
        System.out.println("input list: " + list);
        System.out.print("filterLowerAndUpperCaseFromList2: ");
        List<String> matching = list.stream()
                .filter(Objects::nonNull)
                .filter(s-> s.matches(regex))
                .collect(Collectors.toList());
        System.out.println(matching);
    }

    public static List<String> filterLowerAndUpperCaseFromList4(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String elem : list) {
            if (elem.matches(regex)) {
                System.out.println("add elem:" + elem);
                result.add(elem);
            }
        }
        result.forEach(System.out::println);
        return result;
    }


}
