import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];

        int val = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (val <= n * n) {
            for (int i = left; i <= right; i++) spiral[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) spiral[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) spiral[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) spiral[i][left] = val++;
            left++;
        }

        int sumDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonal += spiral[i][i]; // đường chéo chính
            sumDiagonal += spiral[i][n - i - 1]; // đường chéo phụ
        }

        for (int[] row : spiral) {
            for (int num : row)
                System.out.printf("%4d", num);
            System.out.println();
        }

        System.out.println("Tổng 2 đường chéo: " + sumDiagonal);
    }
}
