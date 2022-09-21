package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex2CountLengthOfAllElements {


    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
        System.out.println("total number of characters: " + countTotalLenghtOfAllElements());
    }

    public static Integer countTotalLenghtOfAllElements(){
        return friends.stream()
//                .mapToInt(name->name.length())
                .mapToInt(String::length)  // with Method reference
                .sum();

    }

}
