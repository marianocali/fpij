package main.fpij.test;

import java.util.List;

public class TestNuevo {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,5,6);
        //1 2 3 -> 4

        Integer elem = numbers.get(0);
        Integer faltante = null;
        for (int i=1; i< numbers.size(); i++ ){
            if(elem+1 == numbers.get(i)){
                System.out.println(numbers.get(i));
                elem = elem +1;
            }else{
                faltante = numbers.get(i-1)+1;
                break;
            }
        }
        System.out.print("faltante: " + faltante);
    }
}
