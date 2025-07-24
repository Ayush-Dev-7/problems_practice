package p_03_Streams;

//Count the Occurrences of Each Element in a List

import p_03_Streams.provider.ArrayListDP;

import java.util.stream.Collectors;

import static p_03_Streams.provider.ArrayListDP.NUM_LIST_2;

public class C_34_FrequencyOfElements {

    public static void main(String[] args) {
        ArrayListDP.printNL2Elements();

        System.out.println("Frequency : " + NUM_LIST_2.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        );
    }
}

//Output :
//ArrayList : 4 2 7 34 23 0 56 4 9 21
//Frequency : {0=1, 34=1, 2=1, 4=2, 21=1, 23=1, 7=1, 56=1, 9=1}
