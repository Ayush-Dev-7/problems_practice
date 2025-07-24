package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the first occurrence of an element in a List

public class C_12_FindFirstOccurrence {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();
        ArrayListDP.addNL1Element(4);
        ArrayListDP.printNL1Elements();

        int target = 4;

        int count = ArrayListDP.NUM_LIST_1.stream()
                .filter(x -> x == target)
                .findFirst()
                .orElse(-1);
        System.out.println("Target Found ? : " + count);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//ArrayList : 1 2 3 4 5 4
//Target Found ? : 4