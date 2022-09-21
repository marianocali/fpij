package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex6SortLengthOfElements {

    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Ti", "Scoot");

    public static void main(String args[]) {
        sortLengthOfElements();
    }

    public static void sortLengthOfElements() {
        friends.stream()
                .mapToInt(String::length)
                .sorted()
                .forEach(len -> System.out.print(len + " "));
    }

}
