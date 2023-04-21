package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2LambdaV1 {

    static final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

    public static void main(String[] args) {

//        String trackingcode = "1234";
//        String s = "It was impossible to get a Order for trackingCode: " + trackingcode;
//        System.out.println("s : " + s);

//        filterNamesWithN();
//        countNamesWithN();
        filterAndCountNamesWithN();

    }

    public static void filterNamesWithN(){
        friends.stream()
                .filter(name ->name.startsWith("N"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void countNamesWithN(){
        System.out.println("Friends starting with N: " +
                friends.stream()
                .filter(name ->name.startsWith("N"))
                .count()
        );
    }

    public static void filterAndCountNamesWithN(){
        List<String> friendsN = friends.stream()
                .filter(name ->name.startsWith("N"))
                .collect(Collectors.toList());

        friendsN.forEach(System.out::println);
        System.out.println("Friends starting with N" + friendsN.size());
    }

}
