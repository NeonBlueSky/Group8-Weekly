package Week2;

public class CodilityTestCoders {

   public static void printNumbers(int N) {
            for (int i = 1; i <= N; i++) {
                String output = "";
                if (i % 2 == 0) {
                    output += "Codility";
                }
                if (i % 3 == 0) {
                    output += "Test";
                }
                if (i % 5 == 0) {
                    output += "Coders";
                }
                System.out.println(output.isEmpty() ? i : output);
            }
        }

        public static void main(String[] args) {
            int N = 20;  // Example value, you can change it to any positive integer
            printNumbers(N);
        }
    }

