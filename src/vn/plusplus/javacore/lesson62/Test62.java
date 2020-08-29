package vn.plusplus.javacore.lesson62;

import java.util.Scanner;

public class Test62 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien: ");
        int n = scn.nextInt();

        StudenManagement studenManagement = new StudenManagement(n);

        System.out.println("Tong so sinh vien do la: "+ studenManagement.tinhDo());
        System.out.println("Tong so sinh vien rot la: " + studenManagement.tinhRot());

    }
}
