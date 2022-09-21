package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex7GetLongestNameFromList {
    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scooty");

    public static void main(String[] args) {
        System.out.println(String.format("longest name in list: %s", pickLongestName()));
    }

    public static String pickLongestName(){

        Optional<String> aLongName = friends.stream()
                .reduce((name1, name2)
                        -> name1.length() >= name2.length() ? name1 : name2);
                return aLongName.orElse("");
    }

}
