import javax.swing.*;

public class BicycleApp {
    public static void main(String[] args) {

        String name,make;
        double price;

        name = JOptionPane.showInputDialog("Please enter your full name: ");

        make = JOptionPane.showInputDialog("Please enter the make of your bike: ");

        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter your full name: "));

        Bicycle cycle1 = new Bicycle(name,make,price);

        Bicycle cycle2 = new Bicycle();

        name = JOptionPane.showInputDialog("Please enter your full name: ");

        make = JOptionPane.showInputDialog("Please enter the make of your bike: ");

        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter your full name: "));

        cycle2.setOwner(name);

        cycle2.setMake(make);

        cycle2.setPrice(price);

        cycle1.setPrice(cycle1.getPrice()+10.0);

        System.out.println("Owner of Bicycle 1: " + cycle1.getOwner() + "\nOwner of Bicycle 2: " + cycle2.getOwner());

        System.out.println("Total Value of the two bicycles is: " + (cycle1.getPrice() + cycle2.getPrice()));



    }
}
