package main.fpij.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NorClass {

    public static void main(String[] args){
       norClassExample1();
       norClassExample2();
    }

    public static void norClassExample1(){
        String regex = "[^abc]";
        String text = "g";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int matches =0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void norClassExample2(){
        String regex = "[^bcr]at";
        String text = "sat mat eat bat cat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches =0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

}
