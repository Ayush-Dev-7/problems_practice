package p_03_Streams;

// Count the occurrences of each word in a String

import java.util.Arrays;
import java.util.stream.Collectors;

public class C_36_FrequencyOfWordsInString {

    public static void main(String[] args) {
        String line = "Oh my my you oh you grown";
        System.out.println("Number : " + line);

        System.out.println("Frequency : " + Arrays.stream(line.split(" "))
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()))
        );
    }
}

//Output :
//Number : Oh my my you oh you grown
//Frequency : {oh=1, Oh=1, grown=1, my=2, you=2}
