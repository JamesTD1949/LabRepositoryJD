public abstract class BankAccount22 implements Taxable22, Transactable22 {

    protected String name;
    protected int accnum;

    public BankAccount22(String name, int accnum)
    {
        setName(name);
        setAcc(accnum);
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

    public void setAcc(int accnum) {
        this.accnum = accnum;
    }

    public String toString(){
        return String.format("Account Holder: %s,\nAccount Number: %s",getName(),getAccnum());
    }


    public abstract double calcTax();
    public abstract void lodge(int amount);
    public abstract void withdraw(int amount);
}
