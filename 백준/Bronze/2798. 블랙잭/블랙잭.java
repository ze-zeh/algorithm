import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] cards = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            cards[i] = input.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum > max && sum <= m) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
