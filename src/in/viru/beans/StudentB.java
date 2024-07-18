package in.viru.beans;

public class StudentB
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter called for id ");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter called for name ");
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        System.out.println("Setter called for subjects ");
        this.subjects = subjects;
    }

    private String [] subjects;
    public StudentB()
    {
        System.out.println("Bean created Viru as you are seeing it.");
    }


}
