package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1CountTotalLength {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {

//        countLenghtOfEveryString();
//        System.out.println("total number of characters: " + countTotalLenghtOfAllElements());
//        System.out.println("length of longest word: " + getMaxWordLength());
        System.out.println("average of all words: " + getAverageWordsLenght());
    }

    public static void countLenghtOfEveryString(){
        friends.stream()
                .mapToInt(name->name.length())
                .forEach(name-> System.out.print(name + " "));

//        result.forEach(name-> System.out.print(name + " "));
    }

    public static Integer countTotalLenghtOfAllElements(){
        return friends.stream()
                .mapToInt(name->name.length())
                .sum();

    }

    public static Integer getMaxWordLength(){
        return friends.stream()
                .mapToInt(name->name.length())
                .max().orElse(0);
    }

    public static Double getAverageWordsLenght(){
        return friends.stream()
                .mapToInt(name->name.length())
                .average().orElse(0);
    }


}
