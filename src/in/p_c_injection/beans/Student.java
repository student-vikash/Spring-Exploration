package in.p_c_injection.beans;

public class Student
{


    public Student(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public Student() {
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private int rollno;


}
