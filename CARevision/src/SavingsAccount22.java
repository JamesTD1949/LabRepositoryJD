public class SavingsAccount22 extends BankAccount22{
    private double Balance;

    public SavingsAccount22(String name, int accNum, double balance)
    {
        super(name,accNum);
        setBalance(balance);
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String toString() {
        return super.toString() + "\nBalance: " + getBalance();
    }


    public double calcTax() {
        return getBalance()*0.0125;
    }

    public void lodge(int amount) {
        setBalance(amount+getBalance());
    }

    public void withdraw(int amount) {
        setBalance(getBalance()-amount);
    }
}
