package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Ex11JoiningAndSortElements {

    private static final List<String> people = Arrays.asList("Brian", "Nat", "Ne", "Raj", "Sara", "Scooty");

    public static void main(String[] args) {
        System.out.println(joiningAndSortElements());
    }
    public static String joiningAndSortElements() {
        return people.stream()
                      .sorted()
                      .collect(joining(", "));
    }

}
