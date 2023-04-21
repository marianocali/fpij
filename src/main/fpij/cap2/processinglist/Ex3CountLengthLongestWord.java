package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex3CountLengthLongestWord {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
        System.out.println("length of longest word: " + getMaxWordLength());
    }

    public static Integer getMaxWordLength(){
        return friends.stream()
                .mapToInt(String::length)
                .max().orElse(0);
    }
}
