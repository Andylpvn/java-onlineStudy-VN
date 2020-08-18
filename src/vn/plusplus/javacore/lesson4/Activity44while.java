package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class Activity44while {
    public static void main(String[] args) {
//khai bao
        int num = 0;
        int count = 0;
        int total = 0;
        double avg = 0;
//user input
        System.out.println("Nhap vao tong so can tinh toan");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
//dieu kien
        while (count <= num) {
            total += count;
            count++;
            avg = total/count;
        }

//in ra man hinh
        System.out.println("Tong cua cac so tu 1 den " + num + " la " + total);
        System.out.println("Trung binh cua cac so tu 1 den " + num + " la " + avg);

    }

}

