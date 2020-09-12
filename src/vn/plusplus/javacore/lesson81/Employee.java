package vn.plusplus.javacore.lesson81;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNunber;

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }

    public abstract long getMealAllowance ();

    public abstract long getSalaryRate();

    public abstract long getWorkingCount();

    public long calculateSalary() {
        long salary = getWorkingCount()*getSalaryRate() + getMealAllowance();
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                '}';
    }
}
