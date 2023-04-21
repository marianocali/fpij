package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8FilteringMultipleValues {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        friends.stream()
                .filter(name -> name.startsWith("N") ||  name.startsWith("B"))
//                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList())
                .forEach(name -> System.out.print(name + " "));
    }

}
