import javax.swing.*;

public class Laptop extends Computer {
    private boolean touchScreen;

    public Laptop(String id, String make, String memtype, int memSize, boolean touchScreen)
    {
        super(id,make,memtype,memSize);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String toString() {
        return super.toString() + "\nTouchscreen: " + touchScreen;
    }

    public static Laptop makeLaptop()
    {
        String id = JOptionPane.showInputDialog("Please enter the id of the laptop: ");

        String make = JOptionPane.showInputDialog("Please enter the make of the laptop: ");

        String memtype = JOptionPane.showInputDialog("Please enter the memory type of the laptop: ");

        String memSizeAsString = JOptionPane.showInputDialog("Please enter the memory size of the laptop: ");

        int memSize = Integer.parseInt(memSizeAsString);

        String yesNo = JOptionPane.showInputDialog("Does your laptop have a touchscreen(Y or N): ");

        if(yesNo.toUpperCase().charAt(0)=='Y')
        {
            boolean touchscreen = true;
        }
        else
        {
            boolean touchscreen = false;
        }

        Laptop hp = new Laptop(id,make,memtype,memSize,touchScreen);

        return hp;
    }
}
