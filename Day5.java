/*Q1. There are 4 companies in the markets of Chefland, A, B, C, and D.
This year, Company A made a profit of P lakh rupees, Company B made a profit of Q lakh rupees, Company C made a profit of R lakh rupees,Company D made a profit of S lakh rupees.
There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
Determine if there is a monopoly in the market or not.*/

import java.util.Scanner;
public class Day5 {
    public static void Monopoly() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T ; t++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            
        
         if(P > (Q + R + S) || Q > (P + R + S) || R > (P + Q + S) || S > (P + Q + R)) {
            System.out.println("Yes");
         }else{
            System.out.println("No");
         }
        }
    }

/*Q2. An array A of length N is said to be pseudo-sorted if it can be made non-decreasing after performing the following operation at most once. Choose an i such that 1 ≤ N −
1≤i≤N−1 and swap Ai and Ai+1 .Given an array A, determine if it is pseudo-sorted or not. */


  public static void pseudoSorted() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int swapCount = 0;

        for (int i = 0; i < N - 1; i++) {
            if (A[i] > A[i + 1]) {
                swapCount++;
                if (swapCount > 1) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Monopoly Check:");
        Monopoly();

        System.out.println("Pseudo-Sorted Array Check:");
        pseudoSorted();


    }
}