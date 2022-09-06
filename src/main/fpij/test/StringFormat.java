package main.fpij.test;

public class StringFormat {


    public static void main(String[] args) {



        System.out.println(String.format("First Line\n"));   //Noncompliant; %n should be used in place of \n to produce the platform-specific line separator

        System.out.println(String.format("First Line"));   //Noncompliant; %n should be used in place of \n to produce the platform-specific line separator
        System.out.println(String.format("First Line %n"));
//        String.format("First Line %n");   //Noncompliant; %n should be used in place of \n to produce the platform-specific line separator

//        System.out.println(String.format("%s"));    // MissingFormatArgumentException there is not parameter to bind

        //boolean
        System.out.println(String.format("Boolean %b", Boolean.TRUE));
        System.out.println(String.format("Boolean %B", Boolean.TRUE));

        //hexadecimal
        System.out.println(String.format("hexadecimal %h", 15));
        System.out.printf("hexadecimal %H%n", 1574);


    }


}
