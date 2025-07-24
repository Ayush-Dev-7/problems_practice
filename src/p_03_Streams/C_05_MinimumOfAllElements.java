package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the Minimum of All Elements in a List

public class C_05_MinimumOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        int min = ArrayListDP.NUM_LIST_1.stream()
                .mapToInt(Integer::intValue).min().orElse(-1);
        System.out.println("min : " + min);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//min : 1