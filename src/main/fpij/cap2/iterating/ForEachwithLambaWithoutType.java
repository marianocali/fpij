package main.fpij.cap2.iterating;

import java.util.Arrays;
import java.util.List;

public class ForEachwithLambaWithoutType {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

        friends.forEach((name) ->
                System.out.println(name));
    }
}
