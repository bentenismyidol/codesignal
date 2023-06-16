package org.codesignalcore;

public class VD23_ques {
    static int[][] solution(int[][] image) {
        int[][] result = new int[image.length-2][image[0].length-2];
        for (int i = 1; i < image.length-1; i++) {
            for (int j = 1; j < image[i].length-1; j++) {
                result[i-1][j-1] = avg(image, i, j);
            }
        }
//        for (int[] i : result) {
//            for (int j : i) {
//                System.out.println(j + ",");
//            }
//        }
        return result;
    }

    static int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                sum += image[i][j];
            }
        }
        System.out.println(sum);
        return sum / 9;
    }

    public static void main(String[] args) {
        int[][] a = {{1,1,1,1},{1,7,1,1},{1,1,1,1}};
        solution(a);
    }
}
