package p_02_HackerRank;

//Sales by Match
//There is a large pile of socks that must be paired by color.
//Given an array of integers representing the color of each sock,
//determine how many pairs of socks with matching colors there are.
//
//Example:
//    n=7
//    ar=[1,2,1,2,1,3,2]
//Explanation:
//There is one pair of color  and one of color .
//There are three odd socks left, one of each color.
//The number of pairs is .
//
//Input:
//int n: the number of socks in the pile
//int ar[n]: the colors of each sock
//
//Output:
//int: the number of pairs

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class _01_Sales_By_Match_BF {
    public static void main(String[] args) {
        int n = 7;
//        List<Integer> ar = new ArrayList<>(asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
        List<Integer> ar = new ArrayList<>(asList(1, 2, 3, 2, 3, 2));
        System.out.println("Final Answer : " + sockMerchant(n, ar));
    }

    static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if (ar.get(i).equals(ar.get(j))) {
                    System.out.printf("i: %d, j: %d, ar: %s\n", i, j, ar);
                    ar.remove(j);
                    ar.remove(i);
                    j = i;
                    System.out.printf("i: %d, j: %d, ar: %s\n", i, j, ar);
                    pairs++;
                    System.out.printf("pairs: %d\n", pairs);
                }
            }
        }
        return pairs;
    }
}
