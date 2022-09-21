package main.fpij.cap2.processinglist;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Ex15 {

    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raj", "Sara", "Scoot");
    final static String str = "w00t";

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Long(10));
        set.add(new Integer(10));

        for (Object object : set) {
            System.out.println("Test - " + object);
        }
    }

    public static void lengthOfEveryElement() {
        //print every element length
        friends.stream()
                .mapToInt(String::length)
                .sorted()
                .forEach(System.out::println);
    }

    //PRINT ODD ELEEMENTS
    public static void printOddLenght() {
        IntStream intStream = friends.stream()
                .mapToInt(String::length)
                .filter(elem -> elem % 2 == 1);
        intStream.forEach(System.out::println);
    }

    public static void printChars() {
        str.chars()
                .forEach(ch -> System.out.println((char)ch));
    }
}
