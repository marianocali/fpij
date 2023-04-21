package main.fpij.test;

import java.util.*;

public class FindComplement {

    public static void main(String[] args) {
        int[] array = {1,15,2,6,9,5,0};


//        List<Integer[]> result = findComplement(array, target);
        // your result should contain {[3, 4], [1, 6]}
        // result.stream().forEach(s -> System.out.println(Arrays.toString(s)));
    }

    //Given an array and a target value, return a list with the position of all the unique
    // couples that sum up to the target value.
    // O(n+n) = O(2n) = O(n)
    private static List<Integer[]> findComplement(int[] array, int target) {
        // CODE GOES HERE
        List<ArrayList<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< array.length; i++) {
            map.put(i,array[i]);
        }
        System.out.println("map:" + map);

        return null;

    }
}