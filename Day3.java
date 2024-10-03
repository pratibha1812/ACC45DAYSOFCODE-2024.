import java.util.Scanner;
public class Day3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        // initial points of both A and B 
        int pointsOfA = 500;
        int pointsOfB = 1000;

        //finding score of A 

        int lostPointsOfA = 2 * X + 4 * (X + Y);
        int scoreA = pointsOfA + pointsOfB - lostPointsOfA;

        //finding score of B

        int lostPointsOfB = 4 * Y  + 2 * (X + Y);
        int scoreB = pointsOfA + pointsOfB - lostPointsOfB;

        //max score among both 

        int maxScore = Math.max(scoreA, scoreB);
        System.out.println(maxScore);
    }
}