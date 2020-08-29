package vn.plusplus.javacore.lesson63;

public class SmartPhone {

    private String brand;
    private boolean hasBluetooth;
    private boolean has5g;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold;

    public SmartPhone() {
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
        this.has5g = has5g;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
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

    public boolean isHas5g() {
        return has5g;
    }

    public void setHas5g(boolean has5g) {
        this.has5g = has5g;
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

    public String toString() {
        return brand + " " + hasBluetooth + " " + has5g + " " + hasWifi + " " + os + " " + memory + " " + color + " " + price + " " + totalSold;
    }

    public int totalRevenue() {

        int revenue = (int) (price * totalSold);
        return revenue;
    }
}