import java.util.Scanner;

public class Bai2 {
    public static final double PI = 3.14159265;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        int k = sc.nextInt();

        double circumference = 2 * PI * r;
        double area = PI * r * r;
        double power = Math.pow(r, k);
        double sqrt = Math.sqrt(r + k);
        double abs = Math.abs(r - k);

        System.out.println("Chu vi: " + circumference);
        System.out.println("Diện tích: " + area);
        System.out.println("r^k: " + power);
        System.out.println("√(r + k): " + sqrt);
        System.out.println("|r - k|: " + abs);
    }
}
