package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the Maximum of All Elements in a List

public class C_04_MaximumOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        int max = ArrayListDP.NUM_LIST_1.stream()
                .mapToInt(Integer::intValue).max().orElse(-1);
        System.out.println("max : " + max);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//max : 5