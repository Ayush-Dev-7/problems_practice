package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

//Sort a List of Strings by Their Length

public class C_20_SortListOfStringsByLengthInAscendingOrder {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

        System.out.println("Ascending : " + ArrayListDP.STRING_LIST_1.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length))
                .toList());


        System.out.println("Descending : " + ArrayListDP.STRING_LIST_1.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList());
    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//Ascending : [ayush, kapil, anurag, shivam, chandan]
//Descending : [chandan, anurag, shivam, ayush, kapil]