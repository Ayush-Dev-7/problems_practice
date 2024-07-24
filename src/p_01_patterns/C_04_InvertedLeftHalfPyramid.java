package p_01_patterns;

public class C_04_InvertedLeftHalfPyramid {
    public static void main(String[] args) {
            //*****
            // ****
            //  ***
            //   **
            //    *

        logic(5);
    }

    public static void logic(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i-1; k++) {
                System.out.print(" ");
            }
            for (int j = num - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
