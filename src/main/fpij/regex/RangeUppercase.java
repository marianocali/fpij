package main.fpij.regex;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RangeUppercase {

    private static final String text = "Two Uppercase alphabets 34 overall";
    public static void main(String[] args) {
        String regex = "[A-Z]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
        filterUppercase(text);
    }

    public static void filterUppercase(String text){
        IntStream listUpper = text.chars()
            .filter( Character::isUpperCase);
   //     listUpper.forEach(elem -> Character((char) elem);
//        System.out.println("filterUppercase: input: " + text + " filtered: " + listUpper.forEach());;
    }
}
