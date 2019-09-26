import javax.swing.*;

public class MessageApp {
    public static void main(String[] args) {

        Message football;

        football = new Message("James O'Donoghue","Colm Cooper");

        String message = JOptionPane.showInputDialog("Please enter the message you want to send: ");

        football.append(message);

        System.out.println(football.toString());
    }
}
