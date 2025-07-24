package p_03_Streams;

//Intersection of 2 Lists

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Stream;

import static p_03_Streams.provider.ArrayListDP.NUM_LIST_1;
import static p_03_Streams.provider.ArrayListDP.NUM_LIST_2;

public class C_31_IntersectionOfTwoLists {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();
        ArrayListDP.printNL2Elements();

        System.out.println("Common Elements : " + NUM_LIST_1.stream()
                .filter(NUM_LIST_2::contains)
                .toList()
        );

    }
}

//Output :
//ArrayList : 1 2 3 4 5
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Common Elements : [2, 4]
