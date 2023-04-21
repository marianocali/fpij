package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex4CountAverageWords {

    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scoot");

    public static void main(String[] args) {
        System.out.println("average of all words: " + getAverageWordsLenght());
    }

    public static Double getAverageWordsLenght() {
        return friends.stream()
                .mapToInt(name -> name.length())
                .average().orElse(0);
    }
}
