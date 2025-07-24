package p_03_Streams;

//Group a list of objects by specific attribute

import p_03_Streams.provider.ArrayListDP;
import pojo.Boy;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static p_03_Streams.provider.ArrayListDP.BOY_LIST_1;

public class C_28_GroupObjectsByAttribute {

    public static void main(String[] args) {
        ArrayListDP.printBL1Elements();

        System.out.println("Grouped By Age : " + BOY_LIST_1.stream()
                .collect(Collectors.groupingBy(Boy::getAge))
        );

    }
}

//Output :
//ArrayList : Ayush chandan anuraG KAPIL ShiVam Avneesh
//Grouped By Age : {33=[anuraG], 27=[Ayush], 28=[KAPIL], 29=[ShiVam, Avneesh], 30=[chandan]}
