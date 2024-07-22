package in.cons_in.beans;

public class StudentV
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

    public AddressV getAddr() {
        return addr;
    }

    public void setAddr(AddressV addr) {
        this.addr = addr;
    }

    public StudentV(int roll, String name, AddressV addr) {
        System.out.println("Initialising roll,name and add using Constructor...");
        this.roll = roll;
        this.name = name;
        this.addr = addr;
    }

    private AddressV addr;
}
