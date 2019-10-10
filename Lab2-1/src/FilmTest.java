public class FilmTest {

    public static void main(String[] args) {

        System.out.println(Film.numberOfFilms);
        Film Strange = new Film("Dr Strange","Scott Derrickson",115);

        System.out.println(Strange.toString());

        System.out.println(Film.numberOfFilms);
    }
}
