package in.scope.beans;

public class Student
{
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        System.out.println("String int bean Created viru...");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
