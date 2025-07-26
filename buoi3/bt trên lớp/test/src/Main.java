import java.util.Scanner;

public class Main {
    final static int MONTHS_PER_YEAR = 12;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số năm: ");
        int soNam = sc.nextInt();

        if (soNam < 0) {
            System.out.println("Số năm phải lớn hơn hoặc bằng 0.");
        } else {
            System.out.println("Tổng số tháng: " + (soNam * MONTHS_PER_YEAR));
        }

        sc.close();
    }
}
