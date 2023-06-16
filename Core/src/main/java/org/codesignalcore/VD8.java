package org.codesignalcore;

public class VD8 {
    static int solution(int[][] matrix) {
        int sum = 0;
        int phong = matrix[0].length;
        int tang = matrix.length;
        for (int i = 0; i < phong; i++) {
            for (int j = 0; j < tang && matrix[j][i] > 0; j++) {
                sum += matrix[j][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        System.out.println(solution(matrix));
    }
}
