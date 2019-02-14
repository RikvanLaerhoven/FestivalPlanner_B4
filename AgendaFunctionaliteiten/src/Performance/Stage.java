package Performance;

import java.util.LinkedList;
import java.util.List;

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
    /*
    public void   setEndTime(String temp) {
        this.endTime = temp;

    }
    public String getEndTime() {
        return this.endTime;
    }*/
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
