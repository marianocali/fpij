package main.fpij.test;

import java.util.ArrayList;
import java.util.List;

class Result{
 int a;
 String s;
}

 public final class  MyInterface {

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
   int suma = 0;
   List<String> camino = new ArrayList<>();
   while ((i < SIZE) && (j < SIZE)) {
    suma = matrix[i][j];
    int nroDerecha = 0;
    int nroAbajo = 0;
    int nroIzquierda = 0;
    int nroArriba = 0;
    boolean existeDerecha = existeDerecha(j);
    boolean existeAbajo = existeAbajo(i);
    boolean existeArriba = existeArriba(i);
    boolean existeIzquierda = existeIzquierda(j);
    if (existeDerecha) {
     nroDerecha = matrix[i][j + 1];
    }
    if (existeAbajo) {
     nroAbajo = matrix[i + 1][j];
    }
    if (existeIzquierda) {
     nroIzquierda = matrix[i - 1][j];
    }
    if (existeArriba) {
     nroArriba = matrix[i][j - 1];
    }

    if (existeDerecha && existeIzquierda) {
     if (nroDerecha < nroIzquierda) {
      camino.add("derecha");
      suma = suma + nroDerecha;
      i = i + 1;
     }
     if ((nroIzquierda < nroDerecha) && (nroIzquierda < nroAbajo) && (nroIzquierda < nroArriba)) {
      camino.add("izquierda");
      suma = suma + nroIzquierda;
      i = i - 1;
     }
     if ((nroAbajo < nroDerecha) && (nroAbajo < nroArriba) && (nroAbajo < nroIzquierda)) {
      camino.add("abajo");
      suma = suma + nroAbajo;
      j = j + 1;
     } else {
      camino.add("arriba");
      suma = suma + nroAbajo;
      j = j + 1;
     }
    }
    System.out.println(camino);
    System.out.println(suma);
   }
  }



  private static boolean existeIzquierda(int j) {
   return j>0;
  }

  private static boolean existeArriba(int i) {
   return i>0;
  }

  private static boolean existeAbajo(int i) {
   return i < SIZE;
  }

  private static boolean existeDerecha(int j) {
   return j < SIZE;
  }

 }
