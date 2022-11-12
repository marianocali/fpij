package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Literal {

    public static void main(String args[]){
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");

        if (matcher.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
