package main.fpij.cap2.iterating;

import java.util.Arrays;
import java.util.List;

public class ForEachWithLambda {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

        friends.forEach((final String name) ->
                System.out.println(name));
    }


}
