
public class Student {
    private String name;
    private int namSinh;
    private String diaChi;
    private int diemTX1;
    private int diemTX2;
    private int diemKTHP;
    private int soTietNghi;
    public Student(String name1, int age, String diaChi1, int diemTX1x,
                   int diemTX2x, int diemKTHPx, int soTietNghix){
        name = name1;
        namSinh  = age ;
        diaChi = diaChi1;
        diemTX1 = diemTX1x;
        diemTX2 = diemTX2x;
        diemKTHP = diemKTHPx;
        soTietNghi= soTietNghix;
    }
    public void hienThi(){
        System.out.println(name + " " + namSinh + " " + diaChi + " " +
                diemTX1 +  " " + diemTX2 + " " + diemKTHP + " "+ soTietNghi + " "
                + (diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP * 0.5));
    }
    public String getName(){
        return name;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public double getdiemTX1() {
        return diemTX1;
    }
    public double getdiemTX2() {
        return diemTX2;
    }
    public double getdiemKTHP() {
        return diemKTHP;
    }
    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setName(String Name){
        this.name = name;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setDiemTX1(int diemTX1) {
        this.diemTX1 = diemTX1;
    }
    public void setDiemTX2(int diemTX2) {
        this.diemTX2 = diemTX2;
    }
    public void setDiemKTHP(int diemKTHP) {
        this.diemKTHP = diemKTHP;
    }
    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }
}