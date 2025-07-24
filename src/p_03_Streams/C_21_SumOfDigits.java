package p_03_Streams;

//Find the Sum of Digits of a Number

public class C_21_SumOfDigits {

    public static void main(String[] args) {
        int num = 2214;
        System.out.println("Number : " + num);
        System.out.println("SumOfDigits : " + String.valueOf(num).chars()
                .map(Character::getNumericValue)
                .sum());

    }
}

//Output :
//Number : 2214
//SumOfDigits : 9
