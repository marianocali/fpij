package main.fpij.inheritance;

import java.util.function.Predicate;

public class SomeFunctionalInterfaceImpl implements SomeFunctionalInterface {

    @Override
    public int getSomeNumber() {
        return 0;
    }

    public static void main(String[] args) {
        Predicate<String> checker = a -> a.startsWith("M");
        System.out.println("checker: " + checker.test("Miguel"));

        SomeFunctionalInterface someFunctionalInterface = new SomeFunctionalInterfaceImpl();
        System.out.println("result: " + someFunctionalInterface.getSomeNumber());
        someFunctionalInterface.showInput("hi");

        SomeFunctionalInterface.showResult("hola");
        SomeFunctionalInterface.saludar();
    }

}
