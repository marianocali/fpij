package main.fpij.cap2.transforminglist;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ex3UsingLambdaExpression {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
    }
}
