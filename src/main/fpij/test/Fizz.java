package main.fpij.test;

public class Fizz {


    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String[] args) {
        fizzBuzz(15);
    }
/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
 */
    public static void fizzBuzz(int n) {
        for(int i =1; i <=n; i++){
            if((i%3==0)  && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0 ){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
