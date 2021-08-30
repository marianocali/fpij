package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex5PickDifferentNames {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

        final Predicate<String> startWithN = name -> name.startsWith("N");
        final Predicate<String> startWithB = name -> name.startsWith("B");

        final long countFriendsStartN = friends.stream().filter(startWithN).count();
        final long countFriendsStartB = friends.stream().filter(startWithB).count();

        final long countComradesStartN = comrades.stream().filter(startWithN).count();
        final long countComradesStartB = comrades.stream().filter(startWithB).count();

        final long countEditorsStartN = editors.stream().filter(startWithN).count();
        final long countEditorsStartB = editors.stream().filter(startWithB).count();

        System.out.println("countFriendsStartN: " + countFriendsStartN + "\n" +
                "countFriendsStartB: " + countFriendsStartB + "\n" +
                "countComradesStartN: " + countComradesStartN + "\n" +
                "countComradesStartB: " + countComradesStartB + "\n" +
                "countEditorsStartN: " + countEditorsStartN + "\n" +
                "countEditorsStartB: " + countEditorsStartB);

    }
}
