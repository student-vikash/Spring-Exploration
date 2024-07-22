package in.cons_in.beans;

public class Player
{
    private String name;


    private int score;

    public Player(String name, int score, double salary) {
        System.out.println("Viru String - int - double bean Created...");
        this.name = name;
        this.score = score;
        this.salary = salary;
    }
    public Player(int score,String name,  double salary) {
        System.out.println("Viru  int - String -  double bean Created...");
        this.name = name;
        this.score = score;
        this.salary = salary;
    }
    public Player( double salary,int score,String name ) {
        System.out.println("Viru  double - int - String -  bean Created...");
        this.name = name;
        this.score = score;
        this.salary = salary;
    }
    public Player( int score,double salary,String name ) {
        System.out.println("Viru  int - double -  String -  bean Created...");
        this.name = name;
        this.score = score;
        this.salary = salary;
    }
    public Player(double salary,String name , int score) {
        System.out.println("Viru  double -  String -  int -  bean Created...");
        this.name = name;
        this.score = score;
        this.salary = salary;
    }
    private double salary;

    public void showInfo()
    {
        System.out.println("Name is : "+name);
        System.out.println("Score is : "+score);
        System.out.println("Salary is "+salary);
    }
}
