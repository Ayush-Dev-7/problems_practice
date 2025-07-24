package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;

// Convert a List of Strings to Uppercase

public class C_10_StringsToUpper {

    public static void main(String[] args) {
        ArrayListDP.printSL1Elements();

//        Use of collect is done to gather a list of even elements. Omits variable creation,
        System.out.println("All CAPS ! : " + ArrayListDP.STRING_LIST_1.stream()
                .map(x -> x.toUpperCase()).collect(Collectors.toList()));

    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam
//All CAPS ! : [AYUSH, CHANDAN, ANURAG, KAPIL, SHIVAM]
