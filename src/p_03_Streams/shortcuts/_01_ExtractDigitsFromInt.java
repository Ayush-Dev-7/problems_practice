package p_03_Streams.shortcuts;

public class _01_ExtractDigitsFromInt {
    public static void main(String[] args) {
        int num = 2214;
        System.out.println("Number : " + num);

        System.out.println("SumOfDigits : " + String.valueOf(num).chars()
                .map(Character::getNumericValue)
                .boxed()
                .toList()
        );
    }
}

//Output
//Number : 2214
//SumOfDigits : [2, 2, 1, 4]