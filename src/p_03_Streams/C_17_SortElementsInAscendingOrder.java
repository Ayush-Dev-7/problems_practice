package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Sort elements in a List

public class C_17_SortElementsInAscendingOrder {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Sorted : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted().toList());
    }
}

//Output :
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Sorted : [0, 2, 4, 4, 7, 9, 21, 23, 34, 56]
