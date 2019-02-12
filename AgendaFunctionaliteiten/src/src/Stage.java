import Performance.Stages;

public class Stage implements Stages {

    private String beginTime;
    private String endTime;
    private Artist artist;
    private String location;
    private Stage stage;


    public void   setBeginTime(String temp) {
        this.beginTime = temp;
    }
    public String getBeginTime() {
        return this.beginTime;
    }


    public void   setEndTime(String temp) {
        this.endTime = temp;

    }
    public String getEndTime() {
        return this.endTime;
    }

    public void   setLocation(String temp) {
        this.location = temp;
    }
    public String getLocation() {
        return this.location;
    }


    public Stage(String name, String genre, String Stage, int popularity) {

    }
}
