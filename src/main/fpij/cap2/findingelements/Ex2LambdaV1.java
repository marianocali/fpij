package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2LambdaV1 {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

        friends.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList())
                .forEach(name -> System.out.print(name + " "));

    }

}
