package performance;

/***
 *  Gemaakt door Boris Korevaar
 *
 *  Performance is een class waar een optreden wordt samengevoegd met artiesten en podias
 *
 */
public class Performance implements java.io.Serializable{

    private Artist artist;
    private double startTime;
    private double endTime;
    private String name;
    private Stage stage;


    public Performance(){

    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }
    public Artist getArtist()
    {
        return artist;
    }

    public void setActTime(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime(){
        return startTime;
    }
    public double getEndTime(){
        return endTime;
    }

    public Time getTime()
    {
        return new Time(startTime, endTime);
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    public Stage getStage()
    {
        return stage;
    }
    public String toString(){
        return name;
    }

    public boolean compareWith(Performance performance){
        if(this.startTime > performance.getStartTime()){
            return true;
        }
        else{
            return false;
        }
    }

}
