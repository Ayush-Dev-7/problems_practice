package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the count of All Elements in a List

public class C_06_CountOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        long count = ArrayListDP.NUM_LIST_1.stream()
                .count();
        System.out.println("count : " + count);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//count : 5