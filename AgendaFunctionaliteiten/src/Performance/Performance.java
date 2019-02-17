package Performance;

/**
 * @author Boris Korevaar & Rafael Binnenmarsch
 *
 *
 */
public class Performance {

    private ActiveStage stage;
    private Artist artist;
    private int beginTime;
    private int endTime;

    public Performance(ActiveStage stage, Artist artist, int beginTime, int endTime){
        this.stage = stage;
        this.artist = artist;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public ActiveStage getStage() {
        return this.stage;
    }
    public void setStage(ActiveStage stage) {
        this.stage = stage;
    }

    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    public int getEndTime() {
        return endTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


}
