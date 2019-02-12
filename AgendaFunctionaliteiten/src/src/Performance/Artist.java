package Performance;

import javafx.stage.Stage;

public interface Artist {

    

    void setPopularity(int temp);
    int getPopularity();

    void setGenre(String temp);
    String getGenre();

    void setName(String temp);
    String getName();

    void setStage(Stage temp);
    Stage getStage();


    void setArtist(String name, String genre, String Stage, int popularity);
    void removeArtist();
}



