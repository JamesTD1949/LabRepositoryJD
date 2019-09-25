import javax.swing.*;

public class Question7 {
    public static void main(String[] args) {

        int i=0;

        while(i!=-1)
        {
            String iAsString = JOptionPane.showInputDialog("Please enter the integer value (-1 to exit): ");

            i = Integer.parseInt(iAsString);

            if(isEven(i))
                JOptionPane.showMessageDialog(null,i + " is even");
            else
                JOptionPane.showMessageDialog(null,i + " is odd");
        }
    }

    private static boolean isEven(int x)
    {
        if(x%2==0)
            return true;
        else
            return false;
    }
}
