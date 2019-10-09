import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryDateImproved {
    public static void main(String[] args) {
        GregorianCalendar borrowDate, returnDate;

        String borrowYearAsString = JOptionPane.showInputDialog("Please enter the year you borrowed the book: (YYYY): ");

        String borrowMonthAsString = JOptionPane.showInputDialog("Please enter the month you borrowed the book: (MM): ");

        String borrowDayAsString = JOptionPane.showInputDialog("Please enter the day you borrowed the book: (DD): ");

        int borrowYear = Integer.parseInt(borrowYearAsString);

        int borrowMonth = Integer.parseInt(borrowMonthAsString);

        int borrowDay = Integer.parseInt(borrowDayAsString);


        borrowDate = new GregorianCalendar(borrowYear, borrowMonth, borrowDay);

        String returnYearAsString = JOptionPane.showInputDialog("Please enter the year you returned the book: (YYYY): ");

        String returnMonthAsString = JOptionPane.showInputDialog("Please enter the month you returned the book: (MM): ");

        String returnDayAsString = JOptionPane.showInputDialog("Please enter the day you returned the book: (DD): ");

        int returnYear = Integer.parseInt(returnYearAsString);

        int returnMonth = Integer.parseInt(returnMonthAsString);

        int returnDay = Integer.parseInt(returnDayAsString);


        returnDate = new GregorianCalendar(returnYear, returnMonth, returnDay);

        int days = Calendar.get(returnDate.get)

        if(borrowDate.compareTo(returnDate)<0 && borrowYear==returnYear)
        {
            JOptionPane.showMessageDialog(null,"You rented the book for " + days + " days.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Dates Supplied !!");
        }
    }
}
