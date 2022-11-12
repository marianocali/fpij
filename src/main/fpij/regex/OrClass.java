package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrClass {


    public static void main(String[] args) {
        String regex = "[abc]";
        String text = "b";
        int matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[ac]";
        text = "b";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[abc]";
        text = "abcb";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9]";
        text = "a4b3c6b";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[a-z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[A-Z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9A-Z]";
        text = "abc123";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-zA-Z]";
        text = "abc123PYQ";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-zA-Z]";
        text = "abc1$2&3-/(";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[bcr]at";
        text = "bat cat rat sal";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static int numberOccurrences(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }
}
