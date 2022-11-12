package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RangeLowerCase {

    public static void main(String[] args) {
        rangeLowerCase();
    }

    public static void rangeLowerCase(){
        String regex = "[a-z]";
        String text = "Two Uppercase alphabets 34 overall";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

}
