package performance;

import java.util.ArrayList;
import java.util.List;

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
                for()
            }
        }
    }
}
