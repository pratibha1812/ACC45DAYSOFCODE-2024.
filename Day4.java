//Q. There is an ATM machine. Initially, it contains a total of K units of money. N people (numbered 1 through N) want to withdraw money; for each valid i, the 
//i-th person wants to withdraw Ai  units of money.
//The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.
//For each person, determine whether they will get the required amount of money or not.

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (K >= A[i]) {
                System.out.println("Yes");
                K -= A[i];
            } else {
                System.out.println("No");
            }
        }
        
    }
}
