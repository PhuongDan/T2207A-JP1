package baitapphanso;
import java.util.Scanner;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }
    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("MẪU SỐ PHẢI KHÁC 0!");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }
    public void enterFrac(Scanner sc) {
        int ts, ms;
        do {
            System.out.print("\tNhập tử số: ");
            ts = sc.nextInt();
            System.out.print("\tNhập mẫu số: ");
            ms = sc.nextInt();

            if (ms == 0) {
                System.out.println("MẪU SỐ PHẢI KHÁC 0!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }
    //cộng ps
    public Fraction add(Fraction ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
    //trừ ps
    public Fraction sub(Fraction ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
    //nhân ps
    public Fraction mul(Fraction ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
    //chia ps
    public Fraction div(Fraction ps2) {
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
}

