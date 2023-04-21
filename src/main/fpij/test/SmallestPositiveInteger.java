package main.fpij.test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveInteger {

//    private static int[] arr =  {1, 3, 6, 4, 1, 2};
//    private static int[] arr = {1, 2, 3};

    private static int[] arr =  {-1, -3};


    public static <E> void print(Set<E> elments){
        for (E elem : elments) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {

    }

//    public static void main(String[] args) {
//        String x = "a";
//        Runnable  r = () ->System.out.println(x);
//        x = "b";
//        r.run();
//    }

//    public static void main(String[] args) {
//        int[] sorted = Arrays.stream(arr).sorted().toArray();
//        int smallest = 1;
//        boolean found = false;
//        for(int i=0; i< (sorted.length -1); i++){
//            if(sorted[i]+1 < sorted[i+1] && sorted[i] >0){
//                smallest = sorted[i]+1;
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            smallest = sorted[sorted.length-1] +1;
//        }
//
//        System.out.println("smallest:" + smallest);
//    }

}
