package org.codesignalcore;

public class VD4 {
    static int solution(int[] inputArray) {
        int result;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length-1; i++) {
            result = inputArray[i] * inputArray[i + 1];
            if (result > max) {
                max = result;
            }
        }
        return max;
//        return solution(inputArray);
    }
    public static void main(String[] args) {
        int[] X = new int[] {3, 6, -2, -5, 7, 3};
        System.out.println(VD4.solution(X));
    }
}
