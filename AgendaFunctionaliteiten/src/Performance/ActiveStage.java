package performance;

/**
 * Boris Korevaar & Rafael Binnenmarsch
 */
public class ActiveStage implements Stages, java.io.Serializable {

    private String name;
    private int beginTime;
    private int endTime;

    public void   setBeginTime(int temp) {
        this.beginTime = temp;
    }
    public int getBeginTime() {
        return this.beginTime;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEndTime(int temp){ this.endTime = temp;}
    public int getEndTime(){return this.endTime;}


    public ActiveStage(String name, int beginTime, int endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;
    }
}
