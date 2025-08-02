
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa

        Student[] ds = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh viên " + (i + 1) + ":");

            System.out.print("Tên: ");
            String name = sc.nextLine();

            System.out.print("Năm sinh: ");
            int namSinh = sc.nextInt();
            sc.nextLine();

            System.out.print("Địa chỉ: ");
            String diaChi = sc.nextLine();

            System.out.print("Điểm TX1: ");
            int tx1 = sc.nextInt();

            System.out.print("Điểm TX2: ");
            int tx2 = sc.nextInt();

            System.out.print("Điểm KTHP: ");
            int kthp = sc.nextInt();

            System.out.print("Số tiết nghỉ: ");
            int nghi = sc.nextInt();
            sc.nextLine();

            ds[i] = new Student(name, namSinh, diaChi, tx1, tx2, kthp, nghi);
        }

        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        for (Student s : ds) {
            s.hienThi();
        }

        sc.close();
    }
}
