public class Movie {
    String tittle;
    String studio;
    String rating;

    public Movie(String tittle, String studio, String rating){
        this.tittle = tittle;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie (String tittle, String studio){
        this.tittle = tittle;
        this.studio = studio;
        this.rating = "PG";
    }

    public void printMovieInfo () {
        System.out.println("Название: "+ tittle);
        System.out.println("Студия: "+ studio);
        System.out.println("Рейтинг: "+ rating);
    }

}
