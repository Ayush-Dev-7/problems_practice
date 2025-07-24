package p_03_Streams;

//Union of 2 Lists

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Stream;

import static p_03_Streams.provider.ArrayListDP.NUM_LIST_1;
import static p_03_Streams.provider.ArrayListDP.NUM_LIST_2;

public class C_32_UnionOfTwoLists {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();
        ArrayListDP.printNL2Elements();

        System.out.println("Union List : " + Stream.concat(NUM_LIST_1.stream(), NUM_LIST_2.stream())
                .distinct()
                .sorted()
                .toList()
        );

    }
}

//Output :
//ArrayList : 1 2 3 4 5
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Union List : [0, 1, 2, 3, 4, 5, 7, 9, 21, 23, 34, 56]
