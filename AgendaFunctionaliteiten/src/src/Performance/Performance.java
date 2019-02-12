package Performance;

public class Performance {

    private Stage stage;
    private Artist artist;
    private String beginTime;
    private String endTime;

    public Performance(Stage stage, Artist artist, String beginTime, String endTime){
        this.stage = stage;
        this.artist = artist;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Stage getStage() {
        return this.stage;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
