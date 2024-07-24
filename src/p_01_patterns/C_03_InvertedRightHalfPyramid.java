package p_01_patterns;

public class C_03_InvertedRightHalfPyramid {

    public static void main(String[] args) {
            //*****
            //****
            //***
            //**
            //*

        logic(5);
    }

    public static void logic(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num-i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
