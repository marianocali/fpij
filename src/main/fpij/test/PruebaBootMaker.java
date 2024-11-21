package main.fpij.test;

import java.util.Arrays;
import java.util.List;

public class PruebaBootMaker {
    /*
       input1: [7,2,5,3,10,1,4] resultado esperado 5
       input2 = [7,6,4,3,1]  resultado esperado 0
    */
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 2, 5, 3, 10, 1, 4);
//        List<Integer> input =  Arrays.asList(7,6,4,3,1);
        int maxElem = 0;
        int maxDistance = 0;
        int lowerElem = input.get(0);
        int beforeElem = input.get(0);
        boolean existedUpInList = false;
        for (int i = 1; i < input.size(); i++) {
            int currentElem = input.get(i);
            if (currentElem > beforeElem) {
                existedUpInList = true;
            } else {
                if (currentElem < lowerElem) {
                    lowerElem = currentElem;
                    maxElem = 0;
                }
            }
            if (existedUpInList) {
                if (currentElem > maxElem) {
                    maxElem = currentElem;
                }
                if (maxElem - lowerElem > maxDistance) {
                    maxDistance = maxElem - lowerElem;
                }
            }
            beforeElem = input.get(i);
        }
        System.out.println(" maxDistance: " + maxDistance);
    }
}

