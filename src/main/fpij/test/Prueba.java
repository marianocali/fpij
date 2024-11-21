package main.fpij.test;

import java.util.HashMap;

public class Prueba {

    public static void main(String[] args) {
        String text = "hola dia hola noche";

        // salida hola: 2, día: 1, noche 1
        // hashMap
        // { (hola) (dia) (noche) }

        String[] words = text.split("\\s+");


        HashMap<String, Integer> statistic = new HashMap<>();
        for(int i=0; i< words.length; i++){
            String word = words[i];

            Integer numberOfAlreadyPresent = statistic.get(word);
            if(numberOfAlreadyPresent == null){
                numberOfAlreadyPresent =0;
            }
            statistic.put(word, numberOfAlreadyPresent + 1);
        }
        System.out.println(statistic);
    }

}
