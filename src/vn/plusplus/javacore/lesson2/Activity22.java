package vn.plusplus.javacore.lesson2;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {

        Scanner tinhcong = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = tinhcong.nextInt();

        int b = 10*a+a;
        int c = 10*b+a;

        System.out.println("So can tinh la: " + a + "+" + b + "+" + c + "=" + (a + b + c));

    }
    }

