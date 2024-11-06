import java.util.Scanner;

public class ContestQualification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Required score to qualify
            int X = scanner.nextInt();
            // Number of Easy and Hard problems solved
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            // Calculate total score
            int totalScore = A + 2 * B;
            
            // Check qualification condition
            if (totalScore >= X) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
        
        scanner.close();
    }
}
