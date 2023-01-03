package baitapphanso;

import java.util.Scanner;

public class In_Rutgon_nghichdao {
    public static void main(String[] args) {
        int tuSo = 0;
        int mauSo = 1;
        Scanner sc = new Scanner(System.in);
        int ts, ms;
        do {
            System.out.print("Nhập vào tử số: ");
            ts = sc.nextInt();
            System.out.print("Nhập vào mẫu số: ");
            ms = sc.nextInt();
            if (ms == 0) {
                System.out.println("Mẫu số phải khác 0!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
        if (tuSo * mauSo < 0) {
            System.out.println("Phân số vừa nhập là: -" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println("Phân số vừa nhập là: "+Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
        System.out.println("Phân số nghịch đảo là: " +Math.abs(mauSo) + "/" + Math.abs(tuSo));
            int ucln=UCLN(tuSo,mauSo);
          int tstg= tuSo/=ucln;
            int mstg=mauSo/=ucln;
        System.out.println("Phân số rút gọn là: " +Math.abs(tstg) + "/" + Math.abs(mstg));

        }
    static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

}





