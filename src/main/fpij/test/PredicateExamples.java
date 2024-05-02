package main.fpij.test;

import java.util.function.Predicate;

public class PredicateExamples {

    static <T> Predicate<T> loggingPredicate(String label, Predicate<? super T> pred) {
        return t -> {
            boolean r = pred.test(t);
            System.out.printf("%s: %s => %s%n", label, t, r);
            return r;
        };
    }

    static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number );
        }
    }
    public static void main(String[] args)
    {
        // example 1 Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        // Calling Predicate method
        System.out.println(lesserthan.test(20));

        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Example 2 Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        Predicate<Integer> mayorQue = loggingPredicate("number > 7 ", number-> number>7);
        pred(10, mayorQue);

        predicate_or();

        predicateOnNumber(10, (i) -> i > 7);
    }
    //Example 4: Predicate OR
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };

    public static void predicate_or()
    {

        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }


        public static void predicateOnNumber(int number, Predicate<Integer> predicate)
        {
            if (predicate.test(number)) {
                System.out.println("Number " + number);
            }
        }


}
