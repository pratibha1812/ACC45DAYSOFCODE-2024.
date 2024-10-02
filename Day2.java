import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();

        int count = 0;
        if (B1 == 0) count++;
        if (B2 == 0) count++;
        if (B3 == 0) count++;

        if(count >= 2){
            System.out.println("Water filling time");
        }else {
            System.out.println("Not now");
        }
    }
}