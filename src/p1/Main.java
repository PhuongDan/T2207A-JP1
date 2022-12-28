package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x="+x);
        y = y + 20 *x;

        if(y>100){
            System.out.println("y ="+y);
        }else {
            System.out.println("x ="+x);
        }

        for(int i=0;i<10;i++){
            System.out.println("i = "+i);
        }
        int S=0;
        for(int i=1;i<=1000;i++){
              S = S + i;
        }
        System.out.println("S ="+S);

        double A=0;
        for(int i=1;i<=1000;i++){
            A = A + (double) 1/i;
        }
        System.out.println("A ="+A);
        int z = tinhTong(10,15);
        boolean t = true;
        // nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int n = sc.nextInt();
        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap 1 string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);
    }
    static int tinhTong(int a,int b){
        return a+b;
    }
    static int tinhTru(int a,int b){
        return a-b;
    }
    static int tinhNhan(int a,int b){
        return a*b;
    }
    static int tinhChia(int a,int b){
        return b==0?null:a/b;
    }
}
