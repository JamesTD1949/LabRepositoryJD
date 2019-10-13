public class Film {
    private String title,director;
    private int duration;
    //create static class variable to track how many film objects created
    public static int numberOfFilms;

    public Film(){
        this("unknown", "unknown", 0);
    }

    public Film(String title, String director, int duration)
    {
        setTitle(title);
        setDirector(director);
        setDuration(duration);

        //add +1 to number of films each time a film object is created
        numberOfFilms++;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public static int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString()
    {
        return("Film: " + getTitle() + "\nDirector: " + getDirector() + "\nDuration: " + getDuration() + " mins");
    }
}
