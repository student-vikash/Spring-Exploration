package in.autowiring.beans;

public class Customer
{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    private Account acc;

    public void showInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("Account Id : "+acc.getAccId());
        System.out.println("Balance : "+acc.getBalance());
    }

}
