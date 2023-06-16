package org.codesignalcore;

public class VD5 {
    public static int shapeArea(int n) {
        int area = 1;
        for (int i = 1; i < n; i++) {
            area += 4 * i;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }
}
