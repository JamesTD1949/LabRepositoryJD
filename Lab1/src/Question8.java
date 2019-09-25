import javax.swing.*;

public class Question8 {
    public static void main(String[] args) {

        int[] contain = new int[10];

        for(int i=0;i<10;i++)
        {
            String numberAsString = JOptionPane.showInputDialog("Please enter an integer: ");

            int number = Integer.parseInt(numberAsString);

            contain[i] = number;
        }

        JOptionPane.showMessageDialog(null,"The first value in the array is " + contain[0]
            + "\nThe fifth value in the array is " + contain[4]);

    }
}
