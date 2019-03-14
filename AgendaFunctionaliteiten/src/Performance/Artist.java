package performance;

/***
 *  Gemaakt door Boris Korevaar
 *
 *  Artist is een class waar een artiest wordt opgezet en er een genre en populariteit aan verbonden word.
 *
 */
public class Artist implements java.io.Serializable {

    private String  name;
    private String  genre;
    private int     popularity;


    public Artist(){

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    public int getPopularity() {
        return this.popularity;
    }
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

}
