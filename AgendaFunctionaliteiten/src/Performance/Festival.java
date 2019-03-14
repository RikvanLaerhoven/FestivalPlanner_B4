package performance;

import java.util.ArrayList;
import java.util.List;

/***
 *  Gemaakt door Boris Korevaar
 *
 *  Festival is een class waar alles kwa artiesten, podias en genre's worden verzameld.
 *  Er zijn checks ingebouwd bij elke add en remove zodat als iets verwijderd word het ook uit alle Lists verwijdert wordt.
 */

public class Festival implements java.io.Serializable {

    private List<Performance>   listOfPerformances;
    private List<Stage>         listOfStages;
    private List<Artist>        listOfArtists;
    private List<Genre>         listOfGenres;

    private String name;
    private String location;

    public Festival(){
        listOfPerformances  = new ArrayList<Performance>();
        listOfStages        = new ArrayList<Stage>();
        listOfArtists       = new ArrayList<Artist>();
        listOfGenres        = new ArrayList<Genre>();
    }

    public Performance getPerformances(int i){
        return this.listOfPerformances.get(i);
    }
    public void addPerformance(Performance performance){
        this.listOfPerformances.add(performance);
    }
    public void removePerformance(int i){this.listOfPerformances.remove(i);}
    public List<Performance> getListOfPerformances() {return this.listOfPerformances;}

    public Stage getStage(int i){ return this.listOfStages.get(i); }
    public void addStage(Stage stage){
        if(!this.listOfStages.equals(stage)) {
            this.listOfStages.add(stage);
        }
        else{
            System.out.println("Stage already exists.");
        }
    }
    public void removeStage(Stage stage){
        for(Stage stages : this.listOfStages){
            this.listOfStages.remove(stage);
        }
    }
    public List<Stage> getStageList(){
        return this.listOfStages;
    }

    public Artist getArtist(int i){ return this.listOfArtists.get(i); }
    public void addArtist(Artist artist){
        for (Artist artists : this.listOfArtists){
            if(artist.getName().equals(artist.getName())){
                artists.setName(artist.getName());
                artists.setGenre(artist.getGenre());
                artists.setPopularity(artist.getPopularity());

                for(Performance performance : this.listOfPerformances){
                    if(artists.getName().equals(performance.getArtist().getName())){
                        artists.setName(artist.getName());
                        artists.setGenre(artist.getGenre());
                        artists.setPopularity(artist.getPopularity());
                    }
                }
                return;
            }
        }
    }
    public void removeArtist(Artist artist){
        this.listOfArtists.remove(artist);
    }
    public List<Artist> getListOfArtists() {return this.listOfArtists;}

    public Genre getGenre(int i) { return this.listOfGenres.get(i); }
    public void addGenre(Genre genre){
        for(Genre genres :  this.listOfGenres){
            if(genres.getName().equals(genre.getName())){
                genres.setName(genre.getName());
                genre.setInfo(genre.getInfo());
                return;
            }
        }
        this.listOfGenres.add(genre);
    }
    public void removeGenre(Genre genre){
        for(Genre genres : this.listOfGenres){
            if(genres.getName().equals(genre.getName())){
                this.listOfGenres.remove(genre);
                for(int i = 0; i < this.listOfArtists.size(); i++){
                    if(genre.getName().equals(this.listOfArtists.get(i).getGenre())){
                        listOfArtists.remove(i);
                        i--;
                    }
                }
                return;
            }
        }
    }
    public List<Genre> getGenreList(){

        return this.listOfGenres;
    }

    // stageName
    public String getStageName()
    {
        return this.name;
    }
    public void setStageName(String name)
    {
        name = this.name;
    }

    //location
    public String getLocation()
    {
        return this.location;
    }
    public void setLocation(String location)
    {
        location = this.location;
    }

}
