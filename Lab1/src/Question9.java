import javax.swing.*;

public class Question9 {
    public static void main(String[] args) {

        double[] weights = new double[] {234.2,123.0,344.8,455.4,150.6};

        String list = "Weights: ";
        int overTwoFifty=0;
        double lightest=0,total=0,overFourHundred=0;

        for(int i=0;i<weights.length;i++)
        {
            if(i<=weights.length-2)
                list += weights[i]+",";
            else
                list += weights[i];


            if(weights[i]<250.0)
            {
                overTwoFifty++;
            }
            else if(weights[i]>400.0)
            {
                overFourHundred++;
            }
            if(i==0 || weights[i]<lightest)
            {
                lightest = weights[i];
            }

            total+=weights[i];
        }

        System.out.println(overFourHundred/weights.length);

        JOptionPane.showMessageDialog(null,list + "\nNumber under 250kg: " + overTwoFifty +
                "\nPercentage over 400 kg: " + (overFourHundred/weights.length)*100 + "%\nLightest Animal: " + lightest
                + "\nAverage weight: " + total/weights.length + " kg");
    }
}
