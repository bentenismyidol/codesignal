package org.codesignalcore;

public class VD26 {
    static boolean solution(int n) {
        return Integer.toString(n).matches("(0|2|4|6|8)*");
    }

    public static void main(String[] args) {
        int n = 2462487;
        solution(n);
    }
}
