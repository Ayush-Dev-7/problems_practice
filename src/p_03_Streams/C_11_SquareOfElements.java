package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;

// Convert a List of Integers to Their Squares

public class C_11_SquareOfElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

//        Use of collect is done to gather a list of even elements. Omits variable creation,
        System.out.println("Squares : " + ArrayListDP.NUM_LIST_1.stream()
                .map(x -> x*x).collect(Collectors.toList()));

    }
}

//Output :
//ArrayList : 1 2 3 4 5
//Squares : [1, 4, 9, 16, 25]
