import java.util.List;

public class Movie {
    String id, title;
    List<String> genre;

    public Movie(String id, String title, List<String> genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }
}
