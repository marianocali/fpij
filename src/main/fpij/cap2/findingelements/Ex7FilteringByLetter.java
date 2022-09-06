package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex7FilteringByLetter {
    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");


    public static void main(String[] args) {

        final long countFriendsStartingWithN =
                friends
                        .stream()
                        .filter(startsWithLetter.apply("N")).count();

        System.out.println("Friends starting with N: " + countFriendsStartingWithN);


    }
    final static Function<String, Predicate<String>> startsWithLetter =
            letter -> name -> name.startsWith(letter);

    //counting elements that start with N or B
    public static long countElementsStartingWithN(){
        return friends.parallelStream()
                .filter(startsWithLetter.apply("N") )
                .count();
    }

    public static long countElementsStartingWithB(){
        return friends.parallelStream()
                .filter(startsWithLetter.apply("B"))
                .count();
    }
}
