import Performance.Stage;

public class Stages implements Stage {

    private String beginTime;
    private String endTime;
    private Artists artist = new Artists();
    private String location;
    private Stages stage = new Stages();


    public void setBeginTime(String temp) {
        this.beginTime = temp;
    }


    public String getBeginTime() {
        return this.beginTime;
    }


    public void setendTime(String temp) {
        this.endTime = temp;

    }


    public String getEndTime() {
        return this.endTime;
    }

//    @Override
//    public void setArtist(Artists temp) {
//        this.artist = temp;
//    }
//
//    @Override
//    public Artists getArtist() {
//        return this.artist;
//    }


    public void setLocation(String temp) {
        this.location = temp;
    }


    public String getLocation() {
        return this.location;
    }


    public void setStage(String name, String genre, String Stage, int popularity) {

    }

    
    public void removeStage() {

    }
}
