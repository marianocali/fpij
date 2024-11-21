package main.fpij.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test7 {

    public static void main(String[] args) {
//        printNumbers(1, 2, 3); // Llama al método con tres argumentos
//        printNumbers(4, 5);    // Llama al método con dos argumentos
//        printNumbers();         // Llama al método sin argumentos
        printCadenas();
        printCadenas("hola","que","tal");
        printCadenas("yo", "bien");
        String[] cadenas = new String[5];
        cadenas[0] = "aca";
        cadenas[1] = "estamos";

        printCadenas(cadenas);

    }

    // Método que acepta un número variable de enteros
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printCadenas(String... cadenas) {
        for (String texto : cadenas) {
            System.out.print(texto + " ");
        }
        System.out.println();
    }
        public static String generateUniqueKey(String deviceId, String param, LocalDateTime timeStamp) {
            // Formato de fecha y hora ISO 8601 para asegurar unicidad
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            String formattedTimestamp = timeStamp.format(formatter);

            // Concatenación con un separador único (por ejemplo, '_')
            return deviceId + "_" + param + "_" + formattedTimestamp;
        }

//        public static void main(String[] args) {
//            String deviceId = "12345";
//            String param = "search";
//            LocalDateTime timeStamp = LocalDateTime.now();
//
//            String uniqueKey = generateUniqueKey(deviceId, param, timeStamp);
//            System.out.println("Clave única: " + uniqueKey);
//        }
}
