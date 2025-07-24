package p_03_Streams;

// Count the Occurrences of Each Character in a String

import java.util.stream.Collectors;

public class C_35_FrequencyOfCharactersInString {

    public static void main(String[] args) {
        String word = "Hello";

        System.out.println("Frequency : " + word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        );
    }
}

//Output :
//
