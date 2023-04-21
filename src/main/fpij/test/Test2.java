package main.fpij.test;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    final static List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

    public static void main(String[] args) {
//        lengths();
        nameMoreLengths();
        sumLengthOfAllElements();

    }

    public static void lengths(){
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
    }

    public static void nameMoreLengths(){
        friends.stream()
                .forEach(name -> System.out.println(name + ": " + name.length()));
    }

    public static void sumLengthOfAllElements(){
        System.out.print(friends.stream()
                .mapToInt(elem -> elem.length())
                .sum());

    }
}
