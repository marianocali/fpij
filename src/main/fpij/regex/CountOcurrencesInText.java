package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOcurrencesInText {


    public static void main(String[] args){
        String regex = "[a-zA-Z]";
        String text = "Two Uppercase alphabets 34 overall";
        int matches = numberOccurrences(regex, text);
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
