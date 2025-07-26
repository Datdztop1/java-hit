import java.util.Scanner;

public class Bai4 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOdd = 0;

        for (int i = 0; i <= n; i++) {
            int f = fibonacci(i);
            System.out.print(f + " ");
            if (f % 2 != 0) sumOdd += f;
        }

        System.out.println("\nTổng các số Fibonacci lẻ: " + sumOdd);
    }
}
