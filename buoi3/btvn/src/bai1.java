import java.util.Scanner;

public class bai1 {
    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hình dạng viên gạch (Square/Triangle/Circle): ");
        String type = sc.nextLine();

        double area = calculateArea(type, sc);
        if (area != -1)
            System.out.println("Diện tích: " + area);
    }

    public static double calculateArea(String type, Scanner sc) {
        switch (type) {
            case SQUARE:
                System.out.print("Nhập cạnh: ");
                double side = sc.nextDouble();
                return side * side;

            case TRIANGLE:
                System.out.print("Nhập đáy và chiều cao: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                return 0.5 * base * height;

            case CIRCLE:
                System.out.print("Nhập bán kính: ");
                double radius = sc.nextDouble();
                final double PI = 3.14159265;
                return PI * radius * radius;

            default:
                System.out.println("Hình dạng không hợp lệ!");
                return -1;
        }
    }
}
