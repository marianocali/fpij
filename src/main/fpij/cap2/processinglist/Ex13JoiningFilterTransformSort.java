package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex13JoiningFilterTransformSort {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
        System.out.println(joiningFilterTransformingToLowerCase());
    }
    public static String joiningFilterTransformingToLowerCase(){
        return friends.stream()
                .filter(name-> name.startsWith("N"))
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }
}
