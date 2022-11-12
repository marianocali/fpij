package main.fpij.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Capital {

//    static HashMap capitals = new HashMap<String, String>();


    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(-1, -2, -3, 8, 7);
//        List<Integer> val = Arrays.asList(6,6,3,4,-1,9,17);
        System.out.println("input: " + val);
        System.out.println(getMaximumEvenSum(val));


    }

   public static int getMaximumEvenSum(List<Integer> val){
        int partialSum=0;
        int maxSum =0;
        for(int i =0; i < val.size(); i++){
            partialSum = partialSum + val.get(i);
            for(int j= i+1; j < val.size(); j++){
                System.out.print("i=" + i + " j="+j + " val.get(j):" + val.get(j) + " ");
                partialSum = partialSum + val.get(j);
            }
            System.out.print("partialSum: " + partialSum + " ");
            if(partialSum%2==0 && partialSum> maxSum){
                maxSum = partialSum;
            }
            partialSum = 0;
            System.out.println("maxSum:" + maxSum);
        }
        return maxSum;
    }

}
