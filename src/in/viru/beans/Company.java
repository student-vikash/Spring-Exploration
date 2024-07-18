package in.viru.beans;

public class Company
{
    private String comp_name;
    private double salary;
    private String [] senior_emp;

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSenior_emp() {
        return senior_emp;
    }

    public void setSenior_emp(String[] senior_emp) {
        this.senior_emp = senior_emp;
    }
}
