package org.codesignalcore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class VD11 {
    static boolean solution(int n) {
        int sum1 = 0,sum2=0;
        String stringnumber = Integer.toString(n);
        String[] strings = stringnumber.split("");
        int half = strings.length / 2;
        int dieukien = strings.length;
        String[] firsthalf = Arrays.copyOfRange(strings, 0, half);
        String[] secondhalf = Arrays.copyOfRange(strings, half, strings.length);
        if (dieukien % 2 == 0) {
            for (String i : firsthalf) {
                sum1 += Integer.parseInt(i);
            }
            for (String j : secondhalf) {
                sum2 += Integer.parseInt(j);
            }
            if (sum1 == sum2) {
                return true;
            }
            else return false;
        }
        else return false;
    }

    public static void main(String[] args) {
//        int n = 123056;
//        int sum1 = 0,sum2=0;
//        String stringnumber = Integer.toString(n);
//        String[] split = stringnumber.split("");
//        int half = split.length / 2;
//        String[] firsthalf = Arrays.copyOfRange(split, 0, half);
//        String[] secondhalf = Arrays.copyOfRange(split, half, split.length);
//        for (String i : firsthalf) {
//            for (String j : secondhalf) {
//
//                sum1 += Integer.parseInt(i);
//            }
//        }
////        for (String j : secondhalf) {
////            sum2 = Integer.parseInt(j) + Integer.parseInt(j+1);
////            System.out.println(sum2);
////        }
//        int x = split.length;
//        int y = x % 2;
//        //System.out.println(y);
        int n = 12306;
        System.out.println(solution(n));
    }

}
