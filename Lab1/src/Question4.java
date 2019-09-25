import javax.swing.*;

public class Question4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your full name: ");

        int length = name.length();

        char initial = name.charAt(0);

        String upper = name.toUpperCase();

        String surname = name.substring(name.lastIndexOf(" "));

        JOptionPane.showMessageDialog(null,"Number of characters in your name: " + length
        + "\nInitial of your first name: " + initial + "\nYour name in capital letters: " + upper + "\nYour last name: " + surname);
    }
}
