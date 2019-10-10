public class BankAccount {

    private String accnum;
    private double balance;
    private Person customer;

    public BankAccount(){
        this("unknown", 0.00, null);
    }

    public BankAccount( String accnum, double balance, Person customer)
    {
        setAccnum(accnum);
        setBalance(balance);
        setCustomer(customer);
    }

    public String getAccnum() {
        return accnum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public void deposit(double deposit)
    {
        balance+=deposit;
    }

    public void withdraw(double withdrawal)
    {
        balance-=withdrawal;
    }




    public String toString() {
        return("Account Number: " + getAccnum() + "\nBalance:£ " + getBalance() + "\nAccount Holder: " + getCustomer());
    }
}
