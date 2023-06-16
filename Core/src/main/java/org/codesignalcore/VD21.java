package org.codesignalcore;


import java.util.regex.Pattern;

public class VD21 {
    static boolean solution(String inputString) {
        String[] octets = inputString.split("\\.");

        if (octets.length != 4) {
            return false;
        }

        for (String octet : octets) {
            try {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255) {
                    return false;
                }
                if (String.valueOf(value).length() != octet.length()) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ip = "172.316.254.1";
        solution(ip);
    }

}
