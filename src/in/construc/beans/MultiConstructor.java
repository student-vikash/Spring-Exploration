package in.construc.beans;

public class MultiConstructor
{
    private String name;
    private String designation;
    private double salary;





    public MultiConstructor(String name, String designation)
    {
        this.name=name;
        this.designation=designation;
        System.out.println("str- str bean created...");
    }
    public MultiConstructor(double salary,String designation)
    {
        this.salary=salary;
        this.designation=designation;
        System.out.println("double - str bean created...");
    }
    public MultiConstructor(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
        System.out.println("str- double bean created...");
    }

    public void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Salary is : "+salary);
        System.out.println("Designation is : "+designation);
    }
}
