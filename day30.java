import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Input for each test case
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            // Calculate valuations
            int valuation1 = 10 * A; // valuation by first investor
            int valuation2 = 5 * B;  // valuation by second investor
            
            // Determine the better offer
            if (valuation1 > valuation2) {
                System.out.println("FIRST");
            } else if (valuation2 > valuation1) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
        
        scanner.close();
    }
}
