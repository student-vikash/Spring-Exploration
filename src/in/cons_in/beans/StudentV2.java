package in.cons_in.beans;

public class StudentV2
{
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addressv2 getAdd() {
        return add;
    }

    public void setAdd(Addressv2 add) {
        this.add = add;
    }

    private Addressv2 add;

    public StudentV2(int roll, String name, Addressv2 add) {
        System.out.println("int String obj bean Created Viru...");
        this.roll = roll;
        this.name = name;
        this.add = add;
    }
}
