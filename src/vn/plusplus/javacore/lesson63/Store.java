package vn.plusplus.javacore.lesson63;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.SortedMap;

public class Store<totalSold> {

    private String storeName;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store(String storeName, String address, int n, SmartPhone[] phones) {
        this.storeName = storeName;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

public int totalSold () {
    int count = 0;
    for (SmartPhone sm : phones) {
        if (sm.getTotalSold() <= n) {
            count += count;
        }
    }
    return count;
}

    SmartPhone sm;
    {
        sm = new SmartPhone();
        System.out.println("Tong doanh thu la: "+ sm.totalRevenue());
    }


}
