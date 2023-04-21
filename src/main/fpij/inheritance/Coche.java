package main.fpij.inheritance;

class Vehiculo { }

interface GPS {
    int gps = 32;
}

public class Coche extends Vehiculo implements GPS {

     static int gps = 45;

    public static void main(String[] args) {

        Coche coche = new Coche();

        int gps = 34;

        System.out.println(gps);
        System.out.println(Coche.gps);
    }

}

    class Coche2 extends Vehiculo implements GPS{
        int gps = 40;

        public static void main(String[] args) {
            Coche2 coche2 = new Coche2();
            int gps = 55;
            System.out.println(gps);
            System.out.println(coche2.gps);
            System.out.println(Coche.gps);
            // 55 40  45
        }
    }

