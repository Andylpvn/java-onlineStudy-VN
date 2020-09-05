package vn.plusplus.javacore.lesson71;

public class FulltimeEmployee extends Employee {

    private long baseSalary;  //luong co ban

    private int overTimeDay; //so ngay lam them

    public FulltimeEmployee(String name, int age, boolean isManagerLevel, long baseSalary) {
        super(name, age, isManagerLevel);
        this.baseSalary = baseSalary;
        this.overTimeDay = overTimeDay;

        if (isManagerLevel == true) {
            this.baseSalary = 20000000;
        } else {
            this.baseSalary = 10000000;
        }
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", overTimeDay=" + overTimeDay +
                '}';
    }
}
