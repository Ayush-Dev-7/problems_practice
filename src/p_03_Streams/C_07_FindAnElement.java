package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find an Elements in a List

public class C_07_FindAnElement {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        int target = 4;

        boolean count = ArrayListDP.NUM_LIST_1.stream()
                        .anyMatch(x -> x == target);
        System.out.println("Target Found ? : " + count);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//Target Found ? : true
