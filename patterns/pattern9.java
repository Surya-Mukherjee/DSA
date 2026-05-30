package patterns;

public class pattern9 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Increasing part
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Decreasing part
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}