package p_01_patterns;

public class C_02_LeftHalfPyramid {
    public static void main(String[] args) {
            //    *
            //   **
            //  ***
            // ****
            //*****

        logic(5);
    }

    public static void logic(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = num-i-1; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
