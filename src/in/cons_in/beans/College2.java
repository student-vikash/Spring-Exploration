package in.cons_in.beans;

public class College2
{
    private String name;
    private double income;

    public String getName() {
        return name;
    }



    public double getIncome() {
        return income;
    }


    public College2(String name, double income) {
        System.out.println("Viru String - double bean Created...");
        this.name = name;
        this.income = income;
    }
}
