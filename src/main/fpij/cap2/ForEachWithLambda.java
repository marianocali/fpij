package main.fpij.cap2;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ForEachWithLambda {

    private static final Logger LOGGER = Logger.getLogger(ForEachWithLambda.class.getName() );

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat","Neal", "Raju", "Sara", "Scott");

        friends.forEach((final String name) ->
                LOGGER.fine(name));
    }


}
