package p1;

import java.util.Scanner;

public class Baitapbuoi2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên n để kiểm tra xem có phải số hoàn hảo hay không:");
        int n =sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum==n) {
            System.out.println(n+ " là số hoàn hảo");
        }else {
            System.out.println(n+" không phải là số hoàn hảo");
        }
        System.out.println("Nhập 1 số nguyên n tìm số đó có vị trí thứ n của dãy Fibonaci:");
            n =sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            System.out.println(fn+ " có vị trí thứ "+n+" của dãy Fibonaci.");
        System.out.println("Nhập 2 số nguyên để tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ucln=UCLN(a,b);
        int bcnn=BCNN(a,b);
   System.out.println(ucln+" là ước chung lớn nhất của 2 số");
   System.out.println(bcnn+" là bội chung nhỏ nhất của 2 số");
        }
    static int UCLN(int a, int b)
    {
        while ( a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
   static int BCNN(int a, int b)
    {
        int result = UCLN(a, b);
        return a * b / result;
    }

        }


