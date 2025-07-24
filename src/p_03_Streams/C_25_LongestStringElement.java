package p_03_Streams;

//Find the Longest string element in a List

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

public class C_25_LongestStringElement {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

        System.out.println("Longest String : " + ArrayListDP.STRING_LIST_1.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null)
        );

    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//Longest String : chandan
