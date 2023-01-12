package BaiTapB9;

public class SinhVien {

     String masinhvien;
    String name;
     int dienthoai;
     String diachi;
    double diemthi;

    public SinhVien() {
    }
    public SinhVien(String masinhvien, String name, int dienthoai, String diachi, Double diemthi) {
        this.masinhvien = masinhvien;
        this.name = name;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
        this.diemthi = diemthi;
    }

    public String getMasinhvien() {
        return masinhvien;
    }
    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Double getDiemthi() {
        return diemthi;
    }

    public void setDiemthi(Double diemthi) {
        this.diemthi = diemthi;
    }

    public void inThongTin() {
        System.out.println("Mã Sinh Viên:" +masinhvien);
        System.out.println("Tên Sinh Viên:" + name);
        System.out.println("Số Điện Thoại:" + dienthoai);
        System.out.println("Địa Chỉ:" + diachi);
        System.out.println("Điểm Thi:" + diemthi);

    }
}
