package in.construc.beans;

public class Emp4
{
    private String name;
    private String hobby;
    private float salary;

    public Emp4(String hobby, float salary) {
        System.out.println("String - Float Constructor injection completed.");
        this.hobby = hobby;
        this.salary = salary;
    }

    public Emp4(String name, String hobby) {
        System.out.println("String - String Constructor injection completed.");
        this.name = name;
        this.hobby = hobby;
    }
    public Emp4(Float salary,String hobby)
    {
        System.out.println("Float - String Constructor injection completed.");
        this.salary=salary;
        this.hobby=hobby;
    }
    public void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Salary is : "+salary);
        System.out.println("Hobby is "+hobby);
    }
}
