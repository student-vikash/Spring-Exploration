package in.scope.beans;

public class EmployeePrototype
{
    public EmployeePrototype() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter called for name String ... ");
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter called for id int ... ");
        this.id = id;
    }

    private String name;
    private int id;
}
