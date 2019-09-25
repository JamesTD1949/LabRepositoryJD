import javax.swing.*;

public class Question2 {
    public static void main(String[] args) {

        String table = "Yards     Inches\n--------     ------\n";

        for(int i=1;i<=10;i++)
        {
            table += i + "          " + i*36 + "\n";
        }

        JTextArea area = new JTextArea();

        area.append(table);

        JOptionPane.showMessageDialog(null,area);


    }
}
