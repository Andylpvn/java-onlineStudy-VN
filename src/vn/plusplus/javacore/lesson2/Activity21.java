package vn.plusplus.javacore.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {

        Scanner tinhtoan = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = tinhtoan.nextInt();
        System.out.println("Nhap so b:");
        int b = tinhtoan.nextInt();

        int cong = a+b;
        int tru = a-b;
        int nhan = a*b;
        int chia = a/b;
        int sodu = a%b;

        System.out.println("a+b=" + a + "+" + b + "=" + cong);
        System.out.println("a-b=" + a + "-" + b + "=" + tru);
        System.out.println("a*b=" + a + "*" + b + "=" + nhan);
        System.out.println("a/b=" + a + "/" + b + "=" + chia);
        System.out.println("a%b=" + a + "%" + b + "=" + sodu);
    }
}
