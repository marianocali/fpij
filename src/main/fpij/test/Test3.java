package main.fpij.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

     public static void main(String[] args){
      //  System.out.println(comparar("hola","hola")); // son iguales
//        System.out.println(comparar("hola","chau")); // son distintos
//        System.out.println(comparar("hola","hola mundo")); // estan contenidos al principio  // 0
//        System.out.println(comparar("mundo","hola mundo")); // estan contenidos al final     // 5
//        System.out.println(comparar("ola","hola mundo")); // estan contenidos en el medio    // 1
//        System.out.println(comparar("hola mundo","hola")); // estan contenidos al principio
        System.out.println(greatestCoincidence("holamundolindo","adiosmndtocruel")); // la mayor coincidencia es mundo
    }


    public static String comparar(String s1, String s2) {
        if (s1.equals(s2)) {
            return "are equals";
        } else if (s2.contains(s1)) {
            if (s2.indexOf(s1) == 0) {
                return "is contained at beginning";
            } else if (s2.indexOf(s1) == s2.length() - s1.length()) {
                return "is contained at end";
            } else return "is contained in the middle";
        } else if (s1.contains(s2)) {
            if (s1.indexOf(s2) == 0) {
                return "is contained at begining";
            } else if (s1.indexOf(s2) == s1.length() - s2.length()) {
                return "is contained at end";
            } else return "is contained in the middle";
        }
        else {
            return greatestCoincidence(s1, s2);
            }
        }

        public static String greatestCoincidence(String s1, String s2){
            String greatestCoincidence = "";
            //iterate over 1st String
            for(int i=0; i< s1.length(); i++){
            Character currentCharacter = s1.charAt(i);
            List<Integer> positions = positions(currentCharacter, s2);
                int maxNumEqualCharacters = 0;
                int initialPositionIns1 = i;
                if (!positions.isEmpty()){
                    //iterate over positions of currentCharacter on String s2
                    for(int j = 0; j< positions.size(); j++){
                        int numEqualCharacters = 0;
                        int initialPositionIns2 = positions.get(j);
                        int k=0;
                        while(initialPositionIns1 +k < s1.length() && initialPositionIns2+k < s2.length() &&
                                s1.charAt(initialPositionIns1 +k) == s2.charAt(initialPositionIns2 + k)) {
                            numEqualCharacters = numEqualCharacters+1;
                            if(maxNumEqualCharacters < numEqualCharacters +1){
                                maxNumEqualCharacters = numEqualCharacters;
                            }
                            k = k+1;
                        }
                        String coincidence = s1.substring(initialPositionIns1,initialPositionIns1+maxNumEqualCharacters);
                        if(coincidence.length()>  greatestCoincidence.length()){
                            greatestCoincidence = coincidence;
                        }
                    }
                }
            }
            System.out.println("The greatest coincidence from: " + s1 + " in " + s2 + " is: " + greatestCoincidence);
            return greatestCoincidence;
        }

    public static List<Integer> positions(char ch, String str){
        ArrayList<Integer> posiciones = new ArrayList<>();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == ch){
                posiciones.add(i);
            }
        }
        return posiciones;
    }
}
