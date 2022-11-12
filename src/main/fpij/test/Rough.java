package main.fpij.test;

import java.io.Serializable;

public class Rough implements Serializable {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+ b;
        b = a-b;
        a = a-b;

        System.out.println(a + " " + b );
    }

    private int id;

}
