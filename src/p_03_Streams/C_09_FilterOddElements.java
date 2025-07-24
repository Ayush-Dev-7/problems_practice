package p_03_Streams;

import p_03_Streams.provider.ArrayListDP;

import java.util.List;
import java.util.stream.Collectors;

//Filter ODD elements from the list

public class C_09_FilterOddElements {

    public static void main(String[] args) {
        ArrayListDP.printNL1Elements();

//        Use of collect is done to gather a list of even elements. Omits variable creation,
        System.out.println("With Collectors : "+ArrayListDP.NUM_LIST_1.stream()
                .filter(x -> x % 2 != 0).collect(Collectors.toList()));

//        toList() was introduced in Java 16,
        List<Integer> evens = ArrayListDP.NUM_LIST_1.stream()
                .filter(x -> x % 2 != 0).toList();
        System.out.println("Even Elements : " + evens);
    }
}

//Output :
//ArrayList : 1 2 3 4 5
//With Collectors : [1, 3, 5]
//Even Elements : [1, 3, 5]
