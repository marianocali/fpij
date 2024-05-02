package main.fpij.regex;


import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Literal {

    private static final Logger LOGGER = Logger.getLogger( Literal.class.getName() );
    public static void main(String args[]){



        int supplier = 25;
        int supplier2 = 45;

        LOGGER.warning("Comparing objects: {} and {}");

//        System.out.println("The CRS ID was not found. It will be applied the supplier {} as CRS ID", supplier);

        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");

        if (matcher.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
