package baitapphanso;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psTong;
        Fraction psTru;
        Fraction psNhan;
        Fraction psThuong;

        System.out.println("Nhập phân số 1: ");
        ps1.enterFrac(sc);
        System.out.println("Nhập phân số 2: ");
        ps2.enterFrac(sc);
        System.out.println("Phân số 1");
        ps1.display();
        System.out.println("Phân số 2");
        ps2.display();

        psTong = ps1.add(ps2);
        psTru = ps1.sub(ps2);
        psNhan = ps1.mul(ps2);
        psThuong = ps1.div(ps2);

        System.out.println("Tổng hai phân số là:");
        psTong.display();
        System.out.println("Hiệu hai phân số là:");
        psTru.display();
        System.out.println("Tích hai phân số là:");
        psNhan.display();
        System.out.println("Thương hai phân số là:");
        psThuong.display();

        sc.close();
    }
}
