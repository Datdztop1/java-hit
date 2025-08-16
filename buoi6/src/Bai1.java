import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Điểm trung bình: ");
            double diemTB = scanner.nextDouble();

            System.out.print("Mã lớp: ");
            String maLop = scanner.nextLine();

            System.out.print("Tên lớp: ");
            String tenLop = scanner.nextLine();

            LopHoc lop = new LopHoc(maLop, tenLop);
            SinhVien sv = new SinhVien(maSV, hoTen, diemTB, lop);
            danhSach.add(sv);
        }

        System.out.println("\n Danh sách sinh viên:");
        for (SinhVien sv : danhSach) {
            sv.inThongTin();
            System.out.println();
        }

        SinhVien maxSV = danhSach.get(0);
        for (SinhVien sv : danhSach) {
            if (sv.getDiemTB() > maxSV.getDiemTB()) {
                maxSV = sv;
            }
        }

        System.out.println(" Sinh viên có điểm TB cao nhất:");
        maxSV.inThongTin();
    }
}
