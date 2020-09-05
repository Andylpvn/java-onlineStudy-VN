package vn.plusplus.javacore.lesson71;

public class Employee {
    private String name;
    private int age;
    private boolean isManagerLevel;
    private boolean isFulltime;


    public Employee(String name, int age, boolean isManagerLevel) {
        this.name = name;
        this.age = age;
        this.isManagerLevel = isManagerLevel;
        this.isFulltime = isFulltime;
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

    public boolean isManagerLevel() {
        return isManagerLevel;
    }

    public void setManagerLevel(boolean managerLevel) {
        isManagerLevel = managerLevel;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public void setFulltime(boolean fulltime) {
        isFulltime = fulltime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isManagerLevel=" + isManagerLevel +
                ", isFulltime=" + isFulltime +
                '}';
    }
}
