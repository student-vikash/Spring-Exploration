package in.construc.beans;

import com.sun.security.jgss.GSSUtil;

public class Employee
{
    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        System.out.println("Viru String bean Created...");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee()
    {
        System.out.println("Bean Created Viru...");
    }
}
