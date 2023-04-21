package main.fpij.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderAppereanceTest {

//    input: abcadbacdabbbdd
//    public static List<String> data = Arrays.asList
//    output: [b, a, d, c] or [b, d, a, c]

    public static void main(String[] args) {
        String s = "abcadbacdabbbdd";

        //get Map with the number of occurrencies
        Map<String, Long> l =
                List.of(s.split(""))
                        .stream().collect(Collectors.toList())
                        .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //return the key sorted by value descending
        l.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(elem-> System.out.print(elem.getKey()));
    }

}
