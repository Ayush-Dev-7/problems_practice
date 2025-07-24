package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;

//Find the first occurrence of an element in a List

public class C_16_RemoveDuplicateElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();
        ArrayListDP.addNL1Element(4);
        ArrayListDP.printNL1Elements();

        System.out.println("Distinct Elements ? : " + ArrayListDP.NUM_LIST_1.stream()
                .distinct().toList());
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//ArrayList : 1 2 3 4 5 4
//Distinct Elements ? : [1, 2, 3, 4, 5]
