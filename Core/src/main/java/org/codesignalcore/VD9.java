package org.codesignalcore;

import java.util.ArrayList;
import java.util.List;

public class VD9 {
    static String[] solution(String[] inputArray) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > max) {
                max = inputArray[i].length();
                count = 1;
            }
            else if (inputArray[i].length() == max) {
                count++;
            }
        }
        String[] output = new String[count];
        int j=0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i].length() == max) {
                    output[j] = inputArray[i];
                    j++;
                }
            }
        return output;
    }

    public static void main(String[] args) {
        String[] input = new String[] {"aba", "aa", "ad", "vcd", "aba"};
        solution(input);
    }
}
