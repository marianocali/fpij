package main.fpij.test;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class SumListElemTest {

    public static List<String> data = Arrays.asList("Hello", "Bye",null, "other", "a");

    public static void main(String[] args) throws Exception {

       System.out.println(data.size());
       int x = data.stream()
               .filter(Objects::nonNull)
               .mapToInt(String::length)
               .sum();

        System.out.println("x:"+ x);

        int cant = 0;
        for (String elem : data) {
            if (null != elem){
                cant += elem.length();
            }

        }
        System.out.println("cant : "+ cant);
    }


}
