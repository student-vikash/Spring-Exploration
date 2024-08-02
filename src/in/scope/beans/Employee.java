package in.scope.beans;

public class Employee
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter called for Name string...");
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter called for Id int ....");
        this.id = id;
    }

    private String name;
    private int id;

    public Employee() {
        System.out.println("Creating default singleton bean Object ...");
    }
}
