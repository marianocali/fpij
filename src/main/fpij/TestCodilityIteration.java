package main.fpij;

import java.util.Arrays;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 */
public class TestCodilityIteration {


    public static void main(String[] args) {
        int[] A = new int[]{32, 1041};


        //10000010001
        //hay un 1
        //  hay un 0 detras?
        //      si debo ver si hay un 1 al final
        //      no debo buscar el siguiente
        int n = 42;

        System.out.println("gap: " + gapCounter(n));
    }


    public static int gapCounter(int n){
        int sumCeros =0;
        String binary = Integer.toBinaryString(n);
        System.out.println("n : "+ n + " binary: " + binary);
        for(int i = 0; i< binary.length() -1; i++){
            System.out.println("binary.charAt(" +i +"): "+ binary.charAt(i));
            if(binary.charAt(i) == '1' && binary.charAt(i+1) == '0'){
                //debo ver que exista un 1 luego del cero o contar cuantos ceros hay

                int j = i+1;
//                sumCeros =1;
                System.out.println("i:" +i);
                System.out.println("j:" +j);
                while (binary.charAt(j) == '0' && j < binary.length() -1){
                    sumCeros++;
                    j++;
                    System.out.println("sumCeros: " + sumCeros + " j: " +j);
                }
                //termine de contar los ceros existe un 1 en este punto?
                //si entonces es un GAP y la cuenta vale
                if(binary.charAt(j) == '1'){
                    //la cuenta es valida avanzo i hasta j
                    i = j;
                }else{
                    //no, no existe GAP y la cuenta va a cero
                    sumCeros = 0;
                    System.out.println("sumCeros: " + sumCeros );
                }
            }
        }
        System.out.println("sumCeros: " + sumCeros );
        return sumCeros;
    }
}
