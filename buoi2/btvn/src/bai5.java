public class bai5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int sum1 = 0;
        for (int i = 2; i <= 100; i += 2) sum1 += i;
        System.out.println("Tổng chẵn (for): " + sum1);

        int sum2 = 0, j = 2;
        while (j <= 100) {
            sum2 += j;
            j += 2;
        }
        System.out.println("Tổng chẵn (while): " + sum2);
    }
}
