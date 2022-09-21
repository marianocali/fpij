package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Ex14OrderElementsByLength {

    final static List<String> friends = Arrays.asList("Brian","Nate","Nea","Ra","Sar","Scooty","Tob","Jo");

    public static void main(String args[]){
        List<String> orderedFriends = friends.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(orderedFriends);
        orderElementsByLength();
    }

    // TODO #2 Using the java stream API, print each item in
    // order based on how many characters are in each String.
    // The shortest words should be first.
    // Expected output: "Foo, Baz, Bar, Zeta, Fifth"
    public static void orderElementsByLength(){
        friends.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(name-> System.out.print(name + " "));
    }
}
