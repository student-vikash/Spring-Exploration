package in.construc.beans;

public class Employee3
{
    private String name;
    private int enrollment;


    public String getName() {
        return name;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public Employee3(String name, int enrollment) {
        System.out.println("Constructor injection of String and int ");
        this.name = name;
        this.enrollment = enrollment;
    }

    public void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Enrollment is : "+enrollment);
    }
}
