package vn.plusplus.javacore.lesson71;

public class ParttimeEmployee extends Employee {

    private int workHourNumber;

    public ParttimeEmployee(String name, int age, boolean isManagerLevel, int workHourNumber) {
        super(name, age, isManagerLevel);
        this.workHourNumber = workHourNumber;
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "workHourNumber=" + workHourNumber +
                '}';
    }
}
