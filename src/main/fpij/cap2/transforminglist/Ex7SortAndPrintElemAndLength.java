package main.fpij.cap2.transforminglist;

import java.util.*;
import java.util.stream.Stream;

public class Ex7SortAndPrintElemAndLength {

    final static List<String> friends = Arrays.asList("Brian", "Sara", "Scott","Neat", "Neal", "Raju" );

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        friends.forEach(name -> System.out.print(name + " "));
        System.out.println();
        Stream<String> orderedFriends = friends.stream().sorted();
        orderedFriends.forEach(elem -> linkedHashMap.put(elem, elem.length()));
        System.out.println(linkedHashMap);
    }
}
