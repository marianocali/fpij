package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RangeNumeric {

    public static void main(String[] args) {
        rangeNumericExample();
        System.out.println();
        rangeNumericExample2();
    }

    public static void rangeNumericExample(){
        String regex = "[0-9]";
        String text = "ab5c07yu(w3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeNumericExample2(){
        String regex = "[0-5]";
        String text = "ab5c07yu(w3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }


}
