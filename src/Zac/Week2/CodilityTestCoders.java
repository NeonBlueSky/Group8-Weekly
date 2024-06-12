package Zac.Week2;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input value
        System.out.print("Enter a positive integer (N): ");
        int N = scanner.nextInt();

        printNumbers(N);

        scanner.close();
    }

    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder output = new StringBuilder();

            if (i % 2 == 0) {
                output.append(" Codality");
            }
            if (i % 3 == 0) {
                output.append(" Test");
            }
            if (i % 5 == 0) {
                output.append(" Coders");
            }

            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.print(output);
            }
        }
    }
}