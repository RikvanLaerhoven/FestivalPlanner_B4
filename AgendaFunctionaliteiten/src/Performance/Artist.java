package performance;

/**
 * @author Boris Korevaar & Rafael Binnenmarsch
 */
public class Artist implements Artists, java.io.Serializable {

    private ActiveStage stage;
    private String name;
    private String genre;
    private int popularity;

    public Artist(String name, String genre, ActiveStage stage, int popularity){
        this.name = name;
        this.genre = genre;
        this.stage = stage;
        this.popularity = popularity;
    }

    public void setPopularity(int i){
        this.popularity = i;
    }
    public int  getPopularity(){
        return this.popularity;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
