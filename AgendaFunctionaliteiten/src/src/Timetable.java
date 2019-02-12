import Performance.*;

import java.util.LinkedList;
import java.util.List;

public class Timetable {

    public List<Performance> performances = new LinkedList<>();


    public void addPerformance(Stage stage, Artist artist, int beginTime, int endTime){

        Performance temp = new Performance(stage, artist,beginTime,endTime);

        if(performances.contains(stage)){

        }

        performances.add(new Performance(stage, artist, beginTime, endTime));
    }


}


