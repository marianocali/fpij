package main.fpij.codility;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps:
 * one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 * Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 */
public class BinaryGap {

    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,6,7,8,9};
        int n = 32;


        findBinaryGap(n);
    }

    private static void findBinaryGap(int number) {

            String binaryString = Integer.toBinaryString(number);
            System.out.print("number: " + number + " str: " + binaryString + " ");
            int position = binaryString.indexOf('0');

            System.out.print("position: " + position + " ");
            int gap =0;
            int longesGap=0;
            if(position < 0){
                 System.out.println("position > 0 ");
            }else {
                while(position > 0){
                   int positionFirstOne = binaryString.indexOf('1');
                   int positionSecondOne = binaryString.indexOf('1',1);
                   if(positionFirstOne > 0 && positionSecondOne >0){
                       gap = positionSecondOne - positionFirstOne;
                       if(gap > longesGap){
                           longesGap = gap;
                       }
                       System.out.println("gap: " + gap);
                   }
                }
            }
    }

    private static void countGap(String str) {
        System.out.println(" zeros:" +  str.chars()
                        .filter(ch -> ch=='0')
                .count());

    }


}
