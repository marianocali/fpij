package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5UsingMethodReferences {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
