package p_03_Streams;

//Find the Factorial of a Number

import java.util.stream.IntStream;

public class C_22_FactorialOfANumber {

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Number : " + num);
        System.out.println("Factorial : " + IntStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b));

    }
}

//Output :
//Number : 6
//Factorial : 720
