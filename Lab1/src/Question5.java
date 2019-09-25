import javax.swing.*;

public class Question5 {
    public static void main(String[] args) {

        String x2AsString = JOptionPane.showInputDialog("Please enter the coefficient of x^2: ");

        String xAsString = JOptionPane.showInputDialog("Please enter the coefficient of x: ");

        String cAsString = JOptionPane.showInputDialog("Please enter the vslue of c: ");

        int x2 = Integer.parseInt(x2AsString);

        int x = Integer.parseInt(xAsString);

        int c = Integer.parseInt(cAsString);

        double root1 = positiveBRoot(x2,x,c);

        double root2 = negativeBRoot(x2,x,c);

        JOptionPane.showMessageDialog(null,"The root when the square is positive is: " + root1 + "\nThe root when the square is negative is: " + root2);
    }

    private static double positiveBRoot(int x2,int x,int c)
    {
        return (-x + (Math.sqrt(x*x - 4*x2*c)))/2*x2;
    }

    private static double negativeBRoot(int x2,int x,int c)
    {
        return (-x - (Math.sqrt(x*x - 4*x2*c)))/2*x2;
    }
}
