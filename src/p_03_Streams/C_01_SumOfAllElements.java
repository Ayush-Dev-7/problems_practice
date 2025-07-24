package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the Sum of All Elements in a List

public class C_01_SumOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

//        Approach 1
//    numbers.stream() gives you a Stream<Integer>, which is a stream of boxed Integer objects.
//    But .sum() is not available on Stream<Integer> — it's available on IntStream (primitive stream for int).
//        So, mapToInt(Integer::intValue):
//        Unboxes each Integer to a primitive int
//        Converts Stream<Integer> → IntStream
//        Now you can call .sum() directly.
        int sum = ArrayListDP.NUM_LIST_1.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum : " + sum);

//        Approach 2
//        0 → the initial value (identity element)
//        Integer::sum → a method reference to add two integers
//        It's equivalent to: reduce(0, (a, b) -> a + b)
        sum = ArrayListDP.NUM_LIST_1.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum : " + sum);

    }
}

//Output :
//ArrayList : 1 2 3 4 5
//sum : 15
//sum : 15