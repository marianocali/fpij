package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Ex12JoiningTransformingAndSortElements {
    private static final List<String> people = Arrays.asList("Brian", "Nat", "Ne", "Raj", "Sara", "Scooty");

    public static void main(String[] args) {
        System.out.println("transformed list: " + joiningTransformToUpperCaseAndJoiningElements());
    }

    // sort elements, transform to UpperCase, and join in String delimit by Comma
    public static String joiningTransformToUpperCaseAndJoiningElements() {
        return people.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(joining(", "));
    }
}
