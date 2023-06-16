package org.codesignalcore;

public class VD19 {
    static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft==friendsLeft && yourRight==friendsRight || yourLeft==friendsRight && yourRight== friendsLeft;

    }

    public static void main(String[] args) {
        solution(10,5,5,10);
    }
}
