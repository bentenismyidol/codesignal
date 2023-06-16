public class AlphabeticalLoop {
    public static void main(String[] args) {
        char targetChar = 'D';
        char startChar = 'A';
        char endChar = 'Z';

        for (char c = startChar; c <= endChar; c++) {
            int number = c - startChar;
            if (c == targetChar) {
                System.out.println(c + " -> " + number);
                break;  // Exit the loop once the target character is found
            }
        }
    }
}
