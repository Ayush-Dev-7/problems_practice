package p_03_Streams.shortcuts;

public class _01_ExtractDigitsFromInt {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println("Word : " + word);

        System.out.println("Resulting Collection : " + word.chars()
                .mapToObj(c -> (char) c)
                .toList()
        );
    }
}

//Output
//Word : Hello
//Resulting Collection : [H, e, l, l, o]
