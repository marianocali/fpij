package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Ex3JoiningElements {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
//        joiningWithComma();

//        joiningWithCommaAndUpperCase();

         System.out.println(friends.stream()
                .map(String::toUpperCase)
                .collect(joining(",")));


    }



    public static void joiningWithComma(){
        System.out.println(String.join(",", friends));
    }

    public static void joiningWithCommaAndUpperCase(){
        System.out.println(
                friends.stream()
                        .map(String::toUpperCase)
                        .collect(joining(",")));
    }

}
