package main.fpij.test;

public class Division
{
    public static void main(String[] args) {

        long dividend = 9;
        int divisor = 2;
        long quotient = dividend / divisor;

        // Case I - Dividend does not divide the divisor completely
        // The quotient is chopped / truncated
        System.out.print("Integer division \t\t" );
        System.out.println(dividend + " / " + divisor + " = " + quotient);

        // Case II - Mathematical or real life division
        // Use float or double data type to get the actual quotient

        double actualQuotient = (double)dividend / divisor;
        System.out.print("Mathematics division \t\t" );
        System.out.println((double)dividend + " / " + divisor + " = " + actualQuotient);

        // Case III - Integer Division with rounding off
        // the quotient to the closest integer

        long roundedQuotient = Math.round((double)dividend / divisor);
        System.out.print("Round off int division \t\t" );
        System.out.println((double)dividend + " / " + divisor + " = " + roundedQuotient);

    }


}
