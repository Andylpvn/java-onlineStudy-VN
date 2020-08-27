package vn.plusplus.javacore.lesson6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//user nhap du lieu
        Scanner chieuRong = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong");
        int width = chieuRong.nextInt();

        Scanner chieuDai = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        int height = chieuDai.nextInt();

//goi class, in ra man hinh
        Rectangle rt = new Rectangle(width, height);
        System.out.println("Chu vi hinh la " + rt.tinhChuVi());
        System.out.println("Dien tich la " + rt.tinhDienTich());

//goi class check hinh vuong
        boolean checkHV = rt.checkHinhVuong();
        if (checkHV == true) {
            System.out.println("Day la hinh vuong");
        } else {
            System.out.println("Day la hinh chu nhat");
        }
    }
}
