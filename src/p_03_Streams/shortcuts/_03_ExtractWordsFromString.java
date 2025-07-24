package p_03_Streams.shortcuts;

import java.util.Arrays;

public class _03_ExtractWordsFromString {
    public static void main(String[] args) {
        String line = "Oh my my you oh you grown";
        System.out.println("Number : " + line);

        System.out.println("Words : " + Arrays.stream(line.split(" "))
                .toList()
        );
    }
}

//Output
//Number : 2214
//SumOfDigits : [2, 2, 1, 4]