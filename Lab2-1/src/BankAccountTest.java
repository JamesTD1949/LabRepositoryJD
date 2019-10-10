import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {

        Person geraldine = new Person();

        geraldine.setName("Geralding Corker");

        BankAccount acc = new BankAccount("3245",300.00,geraldine);


        System.out.println(acc.toString());

        acc.deposit(500.00);

        System.out.println(acc.toString());

        acc.withdraw(350.00);

        System.out.println(acc.toString());

        //initialize array to hold unknown amount of BankAccount objects




        String choiceAsString = JOptionPane.showInputDialog(null,"How many accounts do you want to add?");
        int choice = Integer.parseInt(choiceAsString);

        BankAccount[] multiple = new BankAccount[choice];

        for(int i=0;i<multiple.length;i++)
        {
            String name = JOptionPane.showInputDialog("Please enter the name of the account holder: ");

            Person accountHolder = new Person();

            accountHolder.setName(name);

            String accNum = JOptionPane.showInputDialog("Please enter the account number: ");

            String balanceAsString = JOptionPane.showInputDialog("Please enter the balance of the account: ");

            double balance = Double.parseDouble(balanceAsString);

            BankAccount account = new BankAccount(accNum, balance, accountHolder);

            multiple[i] = account;

            if(i!=multiple.length-1) {
                String option = JOptionPane.showInputDialog("Do you want to enter another bank account ?(N for No)");

                if (option.equals("N")) {
                    JOptionPane.showMessageDialog(null, "Thank you for using our bank!!");
                    for(int j=0;j<i+1;j++)
                    {
                        System.out.println(multiple[j].toString());
                    }
                    System.exit(0);
                }
            }
        }


    }
}
