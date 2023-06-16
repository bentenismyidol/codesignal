package org.codesignalcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VD25 {
    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
            System.out.print(inputArray[i] + " ");
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] a = {1,2,1};
        solution(a,1,3);
    }
}
