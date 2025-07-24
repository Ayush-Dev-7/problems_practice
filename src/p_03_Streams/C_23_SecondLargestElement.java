package p_03_Streams;

//Find the Second-Largest Element in a List

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

public class C_23_SecondLargestElement {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Descending : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted(Comparator.reverseOrder()).toList());

        System.out.println("Second-Largest Element : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted(Comparator.reverseOrder()).toList().get(1));

        System.out.println("Second-Largest Element 2 : " + ArrayListDP.NUM_LIST_2.stream()
                .sorted(Comparator.reverseOrder())
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
