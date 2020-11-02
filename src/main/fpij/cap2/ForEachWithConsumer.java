package main.fpij.cap2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachWithConsumer {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat","Neal", "Raju", "Sara", "Scott");

        friends.forEach(new Consumer<String>() {
            public void accept(final String name){
                System.out.println(name);
            }
        });
    }

}
