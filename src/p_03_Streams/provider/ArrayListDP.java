package p_03_Streams.provider;

import pojo.Boy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDP {

    //Set1
    public static final List<Integer> NUM_LIST_1 = new ArrayList<>
            (Arrays.asList(1, 2, 3, 4, 5));

    public static void addNL1Element(Integer num) {
        NUM_LIST_1.add(num);
    }

    public static void printNL1Elements() {
        System.out.print("ArrayList : ");
        NUM_LIST_1.forEach(k -> System.out.print(k + " "));
        System.out.println();
    }

    //Set 2
    public static final List<Integer> NUM_LIST_2 = new ArrayList<>
            (Arrays.asList(4, 2, 7, 34, 23, 0, 56, 4, 9, 21));

    public static void addNL2Element(Integer num) {
        NUM_LIST_2.add(num);
    }

    public static void printNL2Elements() {
        System.out.print("ArrayList : ");
        NUM_LIST_2.forEach(k -> System.out.print(k + " "));
        System.out.println();
    }

    //Set3
    public static final List<String> STRING_LIST_1 = new ArrayList<>
            (Arrays.asList("Ayush", "chandan", "anuraG", "KAPIL", "ShiVam"));

    public static void addSL1Element(String str) {
        STRING_LIST_1.add(str);
    }

    public static void printSL1Elements() {
        System.out.print("ArrayList : ");
        STRING_LIST_1.forEach(k -> System.out.print(k + " "));
        System.out.println();
    }

    //Set4
    public static final List<Boy> BOY_LIST_1 = Arrays.asList(
            new Boy(27, "Ayush"),
            new Boy(30, "chandan"),
            new Boy(33, "anuraG"),
            new Boy(28, "KAPIL"),
            new Boy(29, "ShiVam"),
            new Boy(29, "Avneesh"));

    public static void addPL1Element(int age, String name) {
        BOY_LIST_1.add(new Boy(age, name));
    }

    public static void printBL1Elements() {
        System.out.print("ArrayList : ");
        BOY_LIST_1.forEach(k -> System.out.print(k + " "));
        System.out.println();
    }

}
