package main.fpij.test;

public class Test2 {


    public static void main(String[] args) {
        String x = "aabaa";
        char ch = x.charAt(0);
        int nroR = 1;
        String result = "";
        for(int i=1;i < x.length(); i++){
            System.out.println( "\n  i: " +i + " ch:" + ch +   " x.charAt(i): "  + x.charAt(i));
            if(ch == x.charAt(i)){
                System.out.println("son iguales");
                nroR++;
                if(i +1 == x.length()){
                    result = result + nroR + String.valueOf(ch);
                }
            }else {
                // System.out.println("son distintos");
                result = result + nroR + String.valueOf(ch);
                ch = x.charAt(i);
                nroR = 1;
                // System.out.println("result: " + result + " ch: " + ch);
            }
            //result = result + nroR + String.valueOf(ch);
        }
        System.out.println("result:" + result);
    }
}
