package main.fpij.cap2.transforminglist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex6PrintElementAndLength {


    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        HashMap<String, Integer> hashMap = new HashMap<>();

        friends.forEach(elem-> hashMap.put(elem, elem.length()));
        System.out.println(hashMap);
    }
}


