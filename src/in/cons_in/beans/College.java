package in.cons_in.beans;

public class College
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College(String name) {
        System.out.println("Viru College String bean Created...");
        this.name = name;
    }
}
