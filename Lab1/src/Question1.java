import javax.swing.*;

public class Question1 {
    public static void main(String[] args) {



        String exchangeAsString = JOptionPane.showInputDialog("Please enter the current exchange rate: ");

        double exchange = Double.parseDouble(exchangeAsString),gbp=1;

        while(gbp!=0) {

            String gbpAsString = JOptionPane.showInputDialog("Please enter the amount of GBP you want to convert to Euro: ");

            gbp = Double.parseDouble(gbpAsString);

            String result = String.format("%.2f", convert(gbp, exchange));

            JOptionPane.showMessageDialog(null, gbpAsString + " converted is " + result + " euro", "Convert Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static double convert(double gbp,double exchange)
    {
        return gbp*exchange;
    }
}
