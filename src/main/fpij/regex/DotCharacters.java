package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotCharacters {


    public static void main(String[] args) {
        dotCharacterEx1();
        dotCharacterExample2();
    }

    public static void dotCharacterEx1(){
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("foo");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.println("matches: . in foo " + matches);
    }

    public static void dotCharacterExample2(){
        Pattern pattern = Pattern.compile("foo.");
        String text = "foofoo";
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }

        System.out.println("pattern: "+ pattern +  " in text: " + text + " matches: " + matches);
    }

}
