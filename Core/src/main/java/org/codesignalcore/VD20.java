package org.codesignalcore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VD20 {
    static int solution(int[] inputArray) {
        List<Integer> temp = new ArrayList<Integer>();
        int element1 = 0;
        int element2 = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i+1 < inputArray.length) {
                element1 = inputArray[i+1] - inputArray[i];
                element2 = inputArray[i] - inputArray[i+1];
                temp.add(element1);
                temp.add(element2);
            }
        }
//        for (int i : temp) {
//            System.out.println(i);
//        }
        Collections.sort(temp);
        System.out.println(temp.get(temp.size() - 1));
        return temp.get(temp.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,0};
        solution(arr);
    }

}

