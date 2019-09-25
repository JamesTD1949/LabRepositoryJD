import javax.swing.*;

//QUESTION 1 PART 3
public class BookApp2 {
    public static void main(String[] args) {

        String daVinciTitle,daVinciISBN,bibleTitle,bibleISBN;
        float biblePrice,daVinciPrice;
        int biblePages,daVinciPages;

        Book DaVinci,Bible;

        daVinciTitle = JOptionPane.showInputDialog("Please enter the title of your least favourite book: ");

        daVinciISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book: ");

        daVinciPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the page count of your least favourite book: "));

        daVinciPrice = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of your least favourite book: "));

        bibleTitle = JOptionPane.showInputDialog("Please enter the title of your favourite book: ");

        bibleISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book: ");

        biblePages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the page count of your favourite book: "));

        biblePrice = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of your favourite book: "));

        DaVinci = new Book(daVinciTitle,daVinciPrice,daVinciISBN,daVinciPages);

        Bible = new Book(bibleTitle,biblePrice,bibleISBN,biblePages);

        System.out.println("Tilte of Favourite Book\n" + DaVinci.getTitle() + "\n\nLeast Favourite Book\n" + Bible.toString());



    }
}
