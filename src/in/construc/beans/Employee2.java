package in.construc.beans;

public class Employee2
{
    private String name;
    private double salary;

    public Employee2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
