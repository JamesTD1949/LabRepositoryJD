import javax.swing.*;

public class Question6ContainerCream {
    public static void main(String[] args) {

        String lengthAsString = JOptionPane.showInputDialog("Please enter the length of the side of the cubic container: ");

        int length = Integer.parseInt(lengthAsString);

        if(MyMethods.cube(length)>100)
        {
            JOptionPane.showMessageDialog(null,"You can't take this in board, put it into your check in luggage.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You're good to go!");
        }
    }
}
