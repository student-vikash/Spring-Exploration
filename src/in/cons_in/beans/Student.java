package in.cons_in.beans;

public class Student
{
    private String name;
    private int id;

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }



    public String getCollege() {
        return college;
    }



    public Student(String name, int id, String college) {
        System.out.println("Viru String int String bean Created...");
        this.name = name;
        this.id = id;
        this.college = college;
    }

    private String college;

}
