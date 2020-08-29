package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class Activity45 {
    public static void main(String[] args) {

        System.out.println("Nhap vao so can tinh: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 1;
        int total = 1;

        for (count = 1; count <= num; count++) {
            total *= count;
        }

      /*  while (count<=num){

            total *=count;
            count ++;
        }*/

//in ra man hinh
        System.out.println("Ket qua la " + total);

    }
}
