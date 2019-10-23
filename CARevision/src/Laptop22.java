import javax.swing.*;

public class Laptop22 extends Computer22{
    private boolean touchScreen;

    public Laptop22()
    {
        super();
        setTouchScreen(false);
    }

    public Laptop22(String id,String make, String type, int size, boolean touchScreen)
    {
        super(id,make,type,size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen)
    {
        this.touchScreen=touchScreen;
    }


    public String toString() {
        return super.toString() + "\nHas TouchScreen: " + isTouchScreen();
    }

    public Laptop22 makeLaptop(){
        boolean touch;
        String id = JOptionPane.showInputDialog("Please enter your Laptop's ID: ");

        String make = JOptionPane.showInputDialog("Please enter your Laptop's make: ");

        String type = JOptionPane.showInputDialog("Please enter your Laptop's memory type: ");

        String sizeAsString = JOptionPane.showInputDialog("Please enter your Laptop's memory size: ");
        int size = Integer.parseInt(sizeAsString);

        String booleanAsString = JOptionPane.showInputDialog("Does your laptop have a touchscreen: ");
        if(booleanAsString.toUpperCase().charAt(0)=='Y') {
             touch = true;
        }
        else
        {
             touch = false;
        }

        Laptop22 laptop = new Laptop22(id,make,type,size,touch);

        return laptop;
    }
}
