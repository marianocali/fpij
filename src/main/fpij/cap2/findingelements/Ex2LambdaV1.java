package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2LambdaV1 {

    public static void main(String[] args) {

        String trackingcode = "1234";
        String s = "It was impossible to get a Order for trackingCode: " + trackingcode;
        System.out.println("s : " + s);

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

//        friends.stream()
//                .filter(name -> name.startsWith("N"))
//                .collect(Collectors.toList())
//                .forEach(name -> System.out.print(name + " "));

    }

}
