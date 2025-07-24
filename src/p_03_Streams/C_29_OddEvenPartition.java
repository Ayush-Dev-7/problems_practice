package p_03_Streams;

//Partition a List of Integers into Even and Odd Numbers

import p_03_Streams.provider.ArrayListDP;
import pojo.Boy;

import java.util.stream.Collectors;

import static p_03_Streams.provider.ArrayListDP.BOY_LIST_1;
import static p_03_Streams.provider.ArrayListDP.NUM_LIST_2;

public class C_29_OddEvenPartition {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Odd-Even Partition : " + NUM_LIST_2.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
        );

    }
}

//Output :
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Odd-Even Partition : {false=[7, 23, 9, 21], true=[4, 2, 34, 0, 56, 4]}
