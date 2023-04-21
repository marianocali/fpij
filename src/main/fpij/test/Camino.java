package main.fpij.test;

import java.util.*;

public class Camino {

    private final static int SIZE=6;
    private static int[][] matrix = new int[SIZE][SIZE];

    public static void main(String[] args) {
        matrix[0][0] = 10;
        matrix[0][1] = 1;
        matrix[0][2] = 3;
        matrix[0][3] = 11;
        matrix[0][4] = 50;
        matrix[0][5] = 1100;

        matrix[1][0] = 12;
        matrix[1][1] = 12;
        matrix[1][2] = 3;
        matrix[1][3] = 1;
        matrix[1][4] = 2;
        matrix[1][5] = 0;

        matrix[2][0] = 54;
        matrix[2][1] = 1;
        matrix[2][2] = 4;
        matrix[2][3] = 12;
        matrix[2][4] = 19;
        matrix[2][5] = 31;

        matrix[3][0] = 1;
        matrix[3][1] = 1;
        matrix[3][2] = 1;
        matrix[3][3] = 33;
        matrix[3][4] = 32;
        matrix[3][5] = 21;

        matrix[4][0] = 4488;
        matrix[4][1] = 4;
        matrix[4][2] = 89;
        matrix[4][3] = 908;
        matrix[4][4] = 1010;
        matrix[4][5] = 70;

        matrix[5][0] = 88;
        matrix[5][1] = 4;
        matrix[5][2] = 5;
        matrix[5][3] = 5;
        matrix[5][4] = 1;
        matrix[5][5] = 5;

        caminoMasCorto();
    }

    public static void caminoMasCorto() {
        int i = 0;
        int j = 0;
        int suma = matrix[i][j]; //add first element
        List<String> camino = new ArrayList<>();
        String casilleroAnterior = "";
        while ((i < SIZE) && (j < SIZE)) {
            HashMap<String, Integer> casillerosPosibles = new HashMap<String, Integer>();
            suma = matrix[i][j];
            int nroDerecha = 0;
            int nroAbajo = 0;
            int nroIzquierda = 0;
            int nroArriba = 0;
            boolean existeArriba = existeArriba(i);
            boolean existeAbajo = existeAbajo(i);
            boolean existeIzquierda = existeIzquierda(j);
            boolean existeDerecha = existeDerecha(j);
            switch (casilleroAnterior){
                case "derecha" :
                    existeIzquierda = false;
                    break;
                case "izquierda" :
                    existeDerecha = false;
                case "abajo" :
                    existeArriba = false;
                    break;
                case "arriba" :
                    existeAbajo = false;
            }

            if (existeIzquierda) {
                nroIzquierda = matrix[i][j-1];
                casillerosPosibles.put("izquierda", nroIzquierda);
            }
            if (existeDerecha) {
                nroDerecha = matrix[i][j+1];
                casillerosPosibles.put("derecha", nroDerecha);
            }
            if (existeArriba) {
                nroArriba = matrix[i-1][j];
                casillerosPosibles.put("arriba", nroArriba);
            }
            if (existeAbajo) {
                nroAbajo = matrix[i+1][j];
                casillerosPosibles.put("abajo", nroAbajo);
            }

            Optional<Map.Entry<String, Integer>> menor = casillerosPosibles.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .findFirst();
            if(menor.isPresent()){
                String direccion = menor.get().getKey();
                casilleroAnterior = menor.get().getKey();
                camino.add(direccion);
                suma = suma + menor.get().getValue();
                switch (direccion){
                    case "derecha" :
                        j = j+1;
                        break;
                    case "izquierda" :
                        j = j-1;
                        break;
                    case "abajo" :
                        i = i+1;
                        break;
                    case "arriba" :
                        i = i-1;
                }
            }
        }
        System.out.println(camino);
        System.out.println(suma);
    }



        private static boolean existeIzquierda(int j) {
            return j>0;
        }

        private static boolean existeArriba(int i) {
            return i>0;
        }

        private static boolean existeAbajo(int i) {
            return i < SIZE-1;
        }

        private static boolean existeDerecha(int j) {
            return j < SIZE-1;
        }

    }
