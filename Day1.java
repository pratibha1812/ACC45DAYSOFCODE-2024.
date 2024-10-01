import java.util.Scanner;
public class Day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking chef's prepared topics from the user
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // taking input of topic chef gets to speak on
        int x = sc.nextInt();
        //to determine whether chef will win or not
        if(x == A || x == B || x == C ){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    } 
}