package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

//Find the Product of All Elements in a List

public class C_02_ProductOfAllElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

        int product = ArrayListDP.NUM_LIST_1.stream()
                .reduce(1,(a, b) -> a * b);
        System.out.println("product : " + product);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//product : 120