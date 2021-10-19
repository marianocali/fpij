package main.fpij.cap2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTaller {

    private static final Integer[] input1 = {1, 2, 3, 4 , 5, 6};
    private static final Integer[] input2 = {7, 6, 4, -1 , 1, 2};

    public static void main(String[] args) {

        fourNumberSum(input1, 16);

    }

    public static List<Integer[]> fourNumberSum(Integer[] array, int targetSum){
        ArrayList<Integer[]> result = new ArrayList<>();
        System.out.println("array.length: " + array.length);
        System.out.println("array: " + Arrays.toString(array));

        for(int i = 0; i < (array.length- 3); i++){
            System.out.print(" i: " + i);
            for (int j = i+1; j <array.length-2; j ++){
                System.out.print(" j: " + j);
                for(int k= j+1; k <array.length -1; k++ ){
                    System.out.print(" k: " + k);
                    for (int l = k+1; l < array.length; l++){
                        System.out.print(" l: " + l +  " ");
                        int suma = array[i] + array[j] + array [k] + array[l];
                        Integer[] r =new Integer[] {array[i] , array[j] , array [k] , array[l]};
                        System.out.println("r: " + Arrays.toString(r));
                        if(suma == targetSum){
                            result.add(new Integer[] {array[i] , array[j] , array [k] , array[l]});
                        }
                    }
                }
            }
        }
        System.out.println("result.size: " + result.size());
        return result;

    }

}
