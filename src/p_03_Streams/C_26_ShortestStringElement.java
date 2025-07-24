package p_03_Streams;

//Find the Shortest string element in a List

import p_03_Streams.provider.ArrayListDP;

import java.util.Comparator;

public class C_26_ShortestStringElement {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

        System.out.println("Shortest String : " + ArrayListDP.STRING_LIST_1.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null)
        );

    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//Shortest String : Ayush
