package main.fpij.test;

import java.util.Arrays;

public class Palindrome {



    public static void main(String[] args) {

        String palindrome = "aaabbaaa";
        char c;
        for(int i = 0; i < palindrome.length() /2; i++){
            for (c = 'a'; c<= 'z'; ++c){
                if(c < palindrome.charAt(i)){
                    StringBuilder sb = new StringBuilder(palindrome);
                    sb.setCharAt(i, c);

                }
            }
        }


    }


}
