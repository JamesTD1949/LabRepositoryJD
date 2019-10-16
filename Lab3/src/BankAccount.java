public abstract class BankAccount implements Transactable, Taxable{

    private String name;
    private int accnum;

    public BankAccount(String name, int accnum)
    {
        setName(name);
        setAccnum(accnum);
    }

    public String getName() {
        return name;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }


    public String toString() {
        return String.format("Name: %s\nAccount Number: %d",getName(),getAccnum());
    }

    public abstract double calcTax();
    public abstract void lodge(double amount);
    public abstract void withdraw(double amount);
}
