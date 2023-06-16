package org.codesignalcore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VD17 {
    static int solution(int[] inputArray) {
        List<Integer> test = new ArrayList<>();
        for (int i : inputArray) {
            test.add(i);
        }
        int count = 0;
        for (int i = 0; i < test.size(); i++) {
            if (i+1 < test.size() && test.get(i) >= test.get(i+1)) {
                count += (test.get(i) +1) - test.get(i+1);
                test.set(i+1, (test.get(i) + 1));
            }
        }
//        for (int i : test) {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] a = {-1000, 0, -2, 0};
        solution(a);
    }
}
