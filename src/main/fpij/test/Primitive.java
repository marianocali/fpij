package main.fpij.test;

public class Primitive {
    static int a;
    int b;
    public static void main(String[] args) {

//        System.out.println(a);
        Primitive p = new Primitive();
        p.foo();
//        System.out.println(p.getB());

    }

    public void foo(){
        Integer x = null;
        System.out.println(x);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
