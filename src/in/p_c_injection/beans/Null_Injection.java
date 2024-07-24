package in.p_c_injection.beans;

import java.util.Date;

public class Null_Injection {
    private String name;
    private int enrollment;
    private Date dob;

    public Null_Injection(String name, int enrollment, Date dob) {
        System.out.println(" String int Date bean created...");
        this.name = name;
        this.enrollment = enrollment;
        this.dob = dob;
    }
    public void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Enrollment : "+enrollment);
        System.out.println("Dob : "+dob);
    }
}
