package vn.plusplus.javacore.lesson6;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.util.Scanner;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Scanner width, Scanner height) {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int tinhChuVi() {
        int chuVi = (width + height) * 2;
        return chuVi;
    }

    public int tinhDienTich() {
        int dienTich = width * height;
        return dienTich;
    }

    public void print() {
        System.out.println("Nhap chieu dai " + width);
        System.out.println("Nhap chieu rong " + height);
    }

    public boolean checkHinhVuong() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}

