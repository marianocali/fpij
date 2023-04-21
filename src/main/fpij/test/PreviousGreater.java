package main.fpij.test;

public class PreviousGreater {

    // return the previous greater element in all the list.
    // if there is no greater previous element return -1
    // example input: {40, 30, 20, 10}; -> -1, 40, 30, 20
    // example {10, 20, 30, 40} -> -1, -1, -1, -1
    // example {10, 40, 20, 30} -> -1, -1, 40, 40
    public static void main(String args[]) {

        int[] arr= {10, 40, 20, 30};
        System.out.print("-1");

        int previousGreater = -1;
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i ; j ++){
                if(arr[j] > arr[i]){
                    previousGreater = arr[j];

                    if(previousGreater < arr[j]){
                        previousGreater = arr[j];
                    }
                }
            }
            System.out.print(", " + previousGreater);
            previousGreater = -1;
        }

    }
}
