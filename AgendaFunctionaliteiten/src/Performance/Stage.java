package Performance;

/**
 * Boris Korevaar
 */
public class Stage implements Stages {

    private String name;
    private String beginTime;
    private String endTime;
    private String location;

    public void   setBeginTime(String temp) {
        this.beginTime = temp;
    }
    public String getBeginTime() {
        return this.beginTime;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void   setLocation(String temp) {
        this.location = temp;
    }
    public String getLocation() {
        return this.location;
    }



    public Stage(String name, String beginTime, String endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;

    }
}
