package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the Average of All Elements in a List

public class C_03_AverageOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        double average = ArrayListDP.NUM_LIST_1.stream()
                .mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("average : " + average);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//average : 3.0
