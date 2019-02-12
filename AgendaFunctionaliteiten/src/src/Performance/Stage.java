package Performance;


public interface Stage {

    void setBeginTime(String temp);
    String getBeginTime();

    void setendTime(String temp);
    String getEndTime();

    void setLocation(String temp);
    String getLocation();

//    void setArtist(Artist temp);
//    Stage getArtist();


    void setStage(String name, String genre, String Stage, int popularity);
    void removeStage();
}
