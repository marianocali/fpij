package main.fpij.cap2.iterating;

import java.util.Arrays;
import java.util.List;

public class FirstLoop {


    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat","Neal", "Raju", "Sara", "Scott");

        for(String name : friends){
            System.out.println(name);
        }
    }

}
