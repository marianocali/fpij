package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex5LengthMinimumWord {

    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Ti", "Scoot");

    public static void main(String[] args) {
        System.out.println("The length of minimum word of the list is: "+ lengthMinimumWord());
    }

    public static int lengthMinimumWord() {
        return friends.stream()
                .mapToInt(String::length)
                .min().orElse(0);
    }
}
