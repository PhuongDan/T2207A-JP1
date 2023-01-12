package BaiTapB9;

import java.util.Scanner;

public class MainSV {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mã Sinh Viên: ");
        sv.setMasinhvien(sc.nextLine());
        System.out.println("Nhập Tên Sinh Viên: ");
        sv.setName(sc.nextLine());
        System.out.println("Nhập Số Điện Thoại: ");
        sv.setDienthoai(sc.nextInt());sc.nextLine();
        System.out.println("Nhập Địa Chỉ: ");
        sv.setDiachi(sc.nextLine());
        System.out.println("Nhập Điểm Thi: ");
        sv.setDiemthi(sc.nextDouble());
        sv.inThongTin();
    }
}

