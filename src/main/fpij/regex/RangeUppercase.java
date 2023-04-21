package main.fpij.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RangeUppercase {

    public static void main(String[] args) {
        String regex = "[A-Z]";
        String text = "Two Uppercase alphabets 34 overall";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

//    public static List<String> filterUppecase(String text){
//        List<String> result = new ArrayList<>();
//        Pattern pattern = Pattern.compile("[A-Z].");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            result.add(matcher.find());
//        }
//        return text.matches("[A-Z].");
//    }
}
