package main.fpij.inheritance;

@FunctionalInterface
interface SomeFunctionalInterface {

    int getSomeNumber();

    static void showResult(String result){
        System.out.println(result);
    }

    private void show(String input){
        System.out.println(input);
    }

    default void showInput(String input){
        show(input);
    }

    static void saludar() {
        System.out.print("hola");
        saludoStatic();
    }

    private static void saludoStatic() {
        System.out.println(" static world!");
    }

}
