public class VendingMachine {

    private int cans,tokens;

    public VendingMachine(){
        VendingMachine(0,0);
    }

    public void VendingMachine(int cans, int tokens)
    {
        setCans(cans);
        setTokens(tokens);
    }

    public int getCans(){
        return cans;
    }

    public int getTokens() {
        return tokens;
    }

    public void setCans(int cans) {
        this.cans = cans;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public String purchase(){
        if(cans ==0)
            return("Sorry, there are no cans left to purchase. You're token will be returned.");
        else
            cans--;
            tokens++;
            return("Enjoy Your Drink!!");
    }

    public String fillUp(int cans)
    {
        this.cans+=cans;
        return("There are now " + getCans() + " cans in this vending machine.");
    }
}
