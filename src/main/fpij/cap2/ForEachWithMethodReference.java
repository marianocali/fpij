package main.fpij.cap2;

import java.util.Arrays;
import java.util.List;

public class ForEachWithMethodReference {


    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

        friends.forEach(System.out::println);
    }
}
