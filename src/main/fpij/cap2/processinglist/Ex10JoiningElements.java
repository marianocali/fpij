package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Ex10JoiningElements {
    private static final List<String> people = Arrays.asList("Brian", "Sara", "Nat", "Ne", "Raj", "Scooty");

    public static void main(String[] args) {
        System.out.println("Elements with comma using stream and collect joining: " + joiningElements());
    }

    public static String joiningElements() {
        return people.stream()
                .collect(joining(", "));
    }

}

