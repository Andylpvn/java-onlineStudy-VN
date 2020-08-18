package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int n = 0;
            System.out.print("Nhap vao chieu cao cua tam giac: ");
            n = input.nextInt();

            int i, j;
            for (i = 0; i < n; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
