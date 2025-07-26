import java.util.Scanner;

public class Bai1 {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenSum = 0, oddSum = 0, primeCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
            if (isPrime(arr[i])) primeCount++;
        }

        System.out.println("Tổng số chẵn: " + evenSum);
        System.out.println("Tổng số lẻ: " + oddSum);
        System.out.println("Số lượng số nguyên tố: " + primeCount);
    }
}
