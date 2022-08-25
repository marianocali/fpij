package main.fpij.test;

import java.util.*;

public class Kata {


    //Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    //Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

    public static void main(String[] args) {
        // Make sure your class is public
//        System.out.println("elem: " + findUniq(new double[]{ 1, 5, 5, 2, 5, 1 }));
        System.out.println("elem: " + findUniq(new double[]{ 0, 0, 0.55, 0, 0 }));

    }
    private static final Integer MINIMUM_VALUE = 1;

    public static double findUniq(double arr[]) {

        // Do the magic
        //create a map in order to save every number and its ocurrences
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();

        //iterate the array to count ocurrences number and load into map
        for (double v : arr) {
            int occurrences = Optional.ofNullable(map.get(v)).orElse(0);
            map.put(v, ++occurrences);
        }

        double unique = 0;
        //itarate the map to get
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (Objects.equals(MINIMUM_VALUE, entry.getValue())) {
                unique = entry.getKey();
            }
        }
        return unique;
    }
}
