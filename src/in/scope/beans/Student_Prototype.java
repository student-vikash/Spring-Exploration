package in.scope.beans;

public class Student_Prototype
{
    private String name;

    public String getName() {
        return name;
    }

    public Student_Prototype(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public Student_Prototype() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private int rollno;

}
