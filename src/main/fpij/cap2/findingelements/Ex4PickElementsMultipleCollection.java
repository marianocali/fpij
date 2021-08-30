package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex4PickElementsMultipleCollection {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

        final Predicate<String> startWithN = name -> name.startsWith("N");

        final long countFriendsStartN =
                friends.stream().filter(startWithN).count();

        final long countComradesStartN =
                comrades.stream().filter(startWithN).count();

        final long countEditorsStartN =
                editors.stream().filter(startWithN).count();

        System.out.println("countFriendsStartN: " + countFriendsStartN + "\n" +
                "countComradesStartN: " + countComradesStartN + "\n" +
                "countEditorsStartN: " + countEditorsStartN);
    }
}
