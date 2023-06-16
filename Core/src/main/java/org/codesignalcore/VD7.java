package org.codesignalcore;

import java.util.Arrays;

public class VD7 {
    static boolean solution(int[] sequence) {
        int count = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i-1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 1 && i < sequence.length-1 && sequence[i] <= sequence[i-2] && sequence[i+1] <= sequence[i-1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sequence = new int[] {3, 6, 5, 8, 10, 20, 15};
        System.out.println(solution(sequence));
    }
}
