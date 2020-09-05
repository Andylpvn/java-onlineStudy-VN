package vn.plusplus.javacore.lesson63;

import java.util.Scanner;

public class SmartPhone {
    private String brand;//tên hãng điện thoại
    private boolean hasBluetooth;// có bluetooth ko
    private boolean has5G;//có 5G ko
    private boolean hasWifi;// có wifi ko
    private String os;// Hệ điều hành
    private float memory;//Bộ nhớ GB
    private String color;// Màu
    private long price;// Giá bán
    private int total;//tổng số lương điện thoại của hãng
    private int totalSold;//Tổng số bán được

    public SmartPhone(String brand, boolean hasBluetooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price, int totalSold, int total) {
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
        this.total = total;
    }

    public SmartPhone() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                ", has5G=" + has5G +
                ", hasWifi=" + hasWifi +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }

    public SmartPhone enterInformationPhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên hãng: ");
        String brand = scanner.nextLine();

        System.out.print("Có bluetooth không ");
        boolean bluetooth = scanner.nextBoolean();

        System.out.print("Có wifi không ");
        boolean wifi = scanner.nextBoolean();

        System.out.print("Có 5G không ");
        boolean fiveG = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Hệ điều hành: ");
        String HDH = scanner.nextLine();

        System.out.print("Bộ nhớ: ");
        float memory = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Màu: ");
        String color = scanner.nextLine();

        System.out.print("Giá bán: ");
        long price = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Tổng số : ");
        int total = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tổng số bán được: ");
        int totalSold = scanner.nextInt();
        scanner.nextLine();

        SmartPhone x = new SmartPhone(brand, bluetooth, fiveG, wifi, HDH, memory, color, price, totalSold, total);
        return x;
    }
}