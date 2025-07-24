package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

//Sort elements in a List

public class C_18_SortElementsInDescendingOrder {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Sorted : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted(Comparator.reverseOrder()).toList());
    }
}

//Output :
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Sorted : [56, 34, 23, 21, 9, 7, 4, 4, 2, 0]