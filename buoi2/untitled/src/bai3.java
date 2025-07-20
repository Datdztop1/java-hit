import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Cặp: " + i);
            System.out.print(" \n a= ");
            int a = sc.nextInt();

            System.out.print(" b= ");
            int b = sc.nextInt();

            System.out.println("Tổng: " + (a + b));
            System.out.println("Hiệu: " + (a - b));
            System.out.println("Tích: " + (a * b));
            System.out.println("Thương: " + ((b != 0) ? ((double)a / b) : "Không chia được cho 0"));
            System.out.println("Chia lấy dư: " + ((b != 0) ? (a % b) : "Không chia được cho 0"));

            if (a == b) {
                System.out.println("Hai số bằng nhau.");
            } else {
                System.out.println("Hai số không bằng nhau.");
            }
            System.out.println("----------------------------");
        }
    }
}
