package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class Activity44for {
    public static void main(String[] args) {
//khai bao
        int num = 0;   //to Hoang: neu khong khai = 0 co duoc khong? vi sao?
        int count = 0; //to Hoang: neu khong khai = 0 co duoc khong? vi sao?
        int total = 0; //to Hoang: neu khong khai = 0 co duoc khong? vi sao?
        double avg = 0; //to Hoang: neu khong khai = 0 co duoc khong? vi sao?
//user input
        System.out.println("Nhap vao tong so can tinh toan");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
//dieu kien
        for (count = 1; count <= num; count++) {
            total += count;
            avg = total / count;
        }
//in ra man hinh
        System.out.println("Tong cua cac so tu 1 den " + num + " la " + total);
        System.out.println("Trung binh cua cac so tu 1 den " + num + " la " + avg);

    }

}

