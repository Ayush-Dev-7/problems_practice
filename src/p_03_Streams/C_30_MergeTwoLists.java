package p_03_Streams;

//Merge Two Lists into a Single List

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static p_03_Streams.provider.ArrayListDP.NUM_LIST_1;
import static p_03_Streams.provider.ArrayListDP.NUM_LIST_2;

public class C_30_MergeTwoLists {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();
        ArrayListDP.printNL2Elements();

        System.out.println("Merged List : " + Stream.concat(NUM_LIST_1.stream(), NUM_LIST_2.stream())
                .toList());

    }
}

//Output :
//ArrayList : 1 2 3 4 5
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Merged List : [1, 2, 3, 4, 5, 4, 2, 7, 34, 23, 0, 56, 4, 9, 21]
