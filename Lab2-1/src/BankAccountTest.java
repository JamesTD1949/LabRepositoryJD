import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {

        Person geraldine = new Person();

        geraldine.setName("Geralding Corker");

        BankAccount acc = new BankAccount();

        acc.BankAccount("3245",300.00,geraldine);

        System.out.println(acc.toString());

        acc.deposit(500.00);

        System.out.println(acc.toString());

        acc.withdraw(350.00);

        System.out.println(acc.toString());

        //initialize array to hold unknown amount of BankAccount objects

        BankAccount[] multiple = new BankAccount[2];


        String choiceAsString = JOptionPane.showInputDialog(null,"How many accounts do you want to add?");
        int choice = Integer.parseInt(choiceAsString);

        for(int i=0;i<multiple.length;i++)
        {

        }
    }
}
