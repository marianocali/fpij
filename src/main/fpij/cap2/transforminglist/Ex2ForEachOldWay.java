package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2ForEachOldWay {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> uppercaseName = new ArrayList<>();
        System.out.println("friends:  "+ friends);

        friends.forEach(name -> uppercaseName.add(name.toUpperCase()));
        System.out.println("uppercaseName: " + uppercaseName);
    }
}
