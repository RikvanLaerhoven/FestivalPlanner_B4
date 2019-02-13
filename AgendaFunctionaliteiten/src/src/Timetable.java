import Performance.*;

import java.util.LinkedList;
import java.util.List;

public class Timetable {

    public List<Performance> performances = new LinkedList<>();


    public void addPerformance(Stage stage, Artist artist, int beginTime, int endTime){

        Performance temp = new Performance(stage, artist,beginTime,endTime);
        boolean doubleBooking = false;
        boolean noOverlappingTime = true;
        for(int i = 0; i < performances.size(); i++){
            if(performances.get(i).getStage().equals(temp.getStage())){
                if(performances.get(i).getBeginTime()<= temp.getBeginTime() && performances.get(i).getEndTime() <= temp.getBeginTime() || performances.get(i).getBeginTime()>= temp.getEndTime() && performances.get(i).getEndTime() >= temp.getEndTime()){
                    noOverlappingTime = true;
                }
                else{
                    noOverlappingTime = false;
                }
            }
            if(performances.get(i).getArtist().equals(temp.getArtist())){
                if(performances.get(i).getBeginTime() <= temp.getBeginTime()&&performances.get(i).getEndTime() <= temp.getBeginTime() || performances.get(i).getBeginTime() >= temp.getEndTime() && performances.get(i).getEndTime() >= temp.getEndTime()){
                    doubleBooking = false;
                }
                else{
                    doubleBooking = true;
                }
            }
        }
        if(noOverlappingTime == true && doubleBooking == false) {
            performances.add(new Performance(stage, artist, beginTime, endTime));
        }
    }

    public void editPerformance(Performance performance){

    }

}


