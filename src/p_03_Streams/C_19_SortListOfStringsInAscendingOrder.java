package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

//Sort a List of Strings in Alphabetical Order

public class C_19_SortListOfStringsInAscendingOrder {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

        System.out.println("Ascending : " + ArrayListDP.STRING_LIST_1.stream()
                .map(String::toLowerCase)
                .sorted().toList());

        System.out.println("Descending : " + ArrayListDP.STRING_LIST_1.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder()).toList());
    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//Ascending : [anurag, ayush, chandan, kapil, shivam]
//Descending : [shivam, kapil, chandan, ayush, anurag]