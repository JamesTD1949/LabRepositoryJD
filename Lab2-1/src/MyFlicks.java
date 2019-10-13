import javax.swing.*;

public class MyFlicks {

    private static Film[] catalog = new Film[3];

    public static void main(String[] args) {



        for(int i=0;i<catalog.length;i++)
        {
            String title = JOptionPane.showInputDialog("Please enter the title of the film: ");

            String director = JOptionPane.showInputDialog("Please enter the name of the director: ");

            String durationAsString = JOptionPane.showInputDialog("Please enter the duration of the film: ");

            int duration = Integer.parseInt(durationAsString);

            Film account = new Film(title, director, duration);

            catalog[i] = account;

            if(i!=catalog.length-1) {
                String option = JOptionPane.showInputDialog("Do you want to enter another film ?(N for No)");

                if (option.equals("N")) {
                    JOptionPane.showMessageDialog(null, "Thank you for using our cataloging service!!");

                    System.out.println(Film.numberOfFilms);
                    for(int j=0;j<i+1;j++)
                    {
                        System.out.println("\n" + catalog[j].toString());
                    }
                    System.exit(0);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using our cataloging service!!");

                System.out.println(Film.numberOfFilms);
                for(int j=0;j<i+1;j++)
                {
                    System.out.println("\n" + catalog[j].toString());
                }
                System.exit(0);
            }
        }


        //Make films into an attribute -- displayFilms will then access it as it is global
        displayFilms();




    }

    private static JFrame displayFilms()
    {
        JFrame display = new JFrame();

        String output = "Number of films: " + Film.getNumberOfFilms() + "\n\n";

        for(int i=0;i<=catalog.length;i++)
        {
            output += catalog[i].toString();
        }

        JTextArea area = new JTextArea(output);

        display.add(area);

        return display;
    }
}