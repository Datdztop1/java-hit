import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
        }

        for (int x : arr) System.out.print(x + " ");
        System.out.println("\nTổng: " + sum);
        System.out.println("Lớn nhất: " + max);
    }
}
