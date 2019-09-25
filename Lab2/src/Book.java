public class Book {

    private String title;
    private float price;
    private String isbn;
    private int pages;

    public Book(){

        this.title = "No title";
        this.price = 0.0f;
        this.isbn = "No isbn";
        this.pages = 0;

    }

    public Book(String title,float price,String isbn,int pages)
    {
        setTitle(title);
        setPrice(price);
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getTitle(){

        return title;

    }

    public float getPrice(){

        return price;

    }

    public String getIsbn(){

        return isbn;

    }

    public int getPages(){

        return pages;

    }

    public void setTitle(String title){

        this.title = title;

    }

    public void setPrice(float price){

        this.price = price;

    }

    public void setIsbn(String isbn){

        this.isbn = isbn;

    }

    public void setPages(int pages){

        this.pages = pages;

    }



    public String toString(){

        return("Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: " + getIsbn() + "\nPages: " + getPages());

    }

}
