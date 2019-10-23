import javax.swing.*;

public class Computer22Driver {
    public static void main(String[] args) {
        Computer22[] container = new Computer22[2];

        for(int i=0;i<container.length;i++) {
            String id = JOptionPane.showInputDialog("Please enter your Computer or Laptop's ID: ");

            String make = JOptionPane.showInputDialog("Please enter your Computer or Laptop's make: ");

            String type = JOptionPane.showInputDialog("Please enter your Computer or Laptop's memory type: ");

            String sizeAsString = JOptionPane.showInputDialog("Please enter your Computer or Laptop's memory size: ");
            int size = Integer.parseInt(sizeAsString);

            String choice = JOptionPane.showInputDialog("Is your machine a laptop ?");

            if(choice.toUpperCase().charAt(0)=='Y') {
                boolean touch;
                String booleanAsString = JOptionPane.showInputDialog("Does your laptop have a touchscreen: ");
                if(booleanAsString.toUpperCase().charAt(0)=='Y') {
                    touch = true;
                }
                else
                {
                    touch = false;
                }

                Laptop22 laptop = new Laptop22(id,make,type,size,touch);

                container[i] = laptop;
            }
            else
            {
                Computer22 computer = new Computer22(id,make,type,size);
                container[i] = computer;
            }
        }


        for(Computer22 c:container ){
            System.out.println(c.toString());
        }




    }
}
