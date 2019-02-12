import Performance.Performance;
import Performance.Stage;

import java.util.LinkedList;
import java.util.List;

public class Timetable {


    public List<Stage> stages = new LinkedList<>();
    public List<Performance> performances = new LinkedList<>();

    public void addStage(String name, String beginTime, String endTime){
        stages.add(new Stage(name, beginTime, endTime));
    }


}


