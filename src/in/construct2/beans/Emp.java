package in.construct2.beans;

public class Emp
{
    private String name;
    private  int enrollment;

    public Emp(String name, int enrollment) {
        this.name = name;
        this.enrollment = enrollment;
    }
    public void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Enrollment is : "+enrollment);
    }
}
