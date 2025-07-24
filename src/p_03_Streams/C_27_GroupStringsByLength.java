package p_03_Streams;

//Group a List of Strings by Their Length

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;

public class C_27_GroupStringsByLength {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

        System.out.println("Shortest String : " + ArrayListDP.STRING_LIST_1.stream()
                .collect(Collectors.groupingBy(String::length))
        );

    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//Shortest String : {5=[Ayush, KAPIL], 6=[anuraG, ShiVam], 7=[chandan]}
