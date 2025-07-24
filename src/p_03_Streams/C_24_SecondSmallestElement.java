package p_03_Streams;

//Find the Second-Smallest Element in a List

import p_03_Streams.provider.ArrayListDP;

public class C_24_SecondSmallestElement {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Descending : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted().toList());

        System.out.println("Second-Largest Element : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted().toList().get(1));

        System.out.println("Second-Largest Element 2 : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(-1));

    }
}

//Output :
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Descending : [56, 34, 23, 21, 9, 7, 4, 4, 2, 0]
//Second-Largest Element : 34
//Second-Largest Element 2 : 34
