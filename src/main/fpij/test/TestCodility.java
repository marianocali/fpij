package main.fpij.test;

import java.util.Arrays;

public class TestCodility {


    public static void main(String[] args) {


        int[] A = {-1,-2,-7};

        System.out.println("A: " + Arrays.toString(A));
        int minimo = getMinimo(A);
        boolean existe = true;
        for (int i=0; i<A.length; i++){
            existe = existeNro(A, minimo+i);
            System.out.println("existe: " + existe);
            if(!existe){
                int menor = minimo + i;
                if(menor <0){
                    System.out.println("el menor nro que no existe es : " + 1);
                }else {
                    System.out.println("el menor nro que no existe es : " + menor);
                }
            }
        }
    }

    //
    public static int getMinimoNoPresente(){
        int[] A = {-1,-2,-7};

        System.out.println("A: " + Arrays.toString(A));
        int minimo = getMinimo(A);
        boolean existe;
        int menor = 0;

        for (int i=0; i<A.length; i++){
            existe = existeNro(A, minimo+i);
            System.out.println("existe: " + existe);
            if(!existe){
                menor = minimo + i;
                if(menor <0) {
                    menor = 1;
                }
                    System.out.println("el menor nro que no existe es : " + menor);
                }
            }
        return menor;
    }

    public static int getMinimo(int[] A){
        int minimo = A[0];
        for(int i= 0; i <A.length; i++){
            if(minimo > A[i]){
                minimo = A[i];
            }
        }
        return minimo;
    }

    public static boolean existeNro(int[] A, int nro){
        for (int i=0; i< A.length; i++){
            if(A[i] == nro){
                return true;
            }
        }
        return false;
    }

    public static int[] removerMinimo(int[] A, int minimo) {
        int[] B = new int[A.length-1];
        System.out.println("B al inicio: " + Arrays.toString(B));
        int j =0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != minimo) {
                B[j] = A[i];
                j++;
            }
        }
        return B;
    }
}
