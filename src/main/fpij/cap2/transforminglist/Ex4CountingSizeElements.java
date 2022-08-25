package main.fpij.cap2.transforminglist;

import java.util.Arrays;
import java.util.List;

public class Ex4CountingSizeElements {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
    }
}
