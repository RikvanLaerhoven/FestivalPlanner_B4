import Performance.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Boris Korevaar
 *
 * Class voor het toevoegen, verranderen van eigenschappen, sorteren en verwijderen van "Performances".
 */

public class Timetable {

    private List<Performance> performances;

    public Timetable(){
        this.performances = new LinkedList<>();
    }

    public void addPerformance(Stage stage, Artist artist, int beginTime, int endTime){

        Performance temp = new Performance(stage, artist,beginTime,endTime);

        if(bookingAvailable(temp) == true) {
            this.performances.add(new Performance(stage, artist, beginTime, endTime));
        }
    }

    public void editPerformance(Performance performance, Artist artist, int beginTime, int endTime, Stage stage){

        if(bookingAvailable(performance) == true){
            performance.setBeginTime(beginTime);
            performance.setEndTime(endTime);
            performance.setStage(stage);
            performance.setArtist(artist);
        }
    }
    public void editPerformance(Performance performance, int beginTime, int endTime, Stage stage){
        if(bookingAvailable(performance) == true){
            performance.setBeginTime(beginTime);
            performance.setEndTime(endTime);
            performance.setStage(stage);
        }
    }
    public void editPerformance(Performance performance, int beginTime, int endTime){
        if(bookingAvailable(performance) == true){
            performance.setBeginTime(beginTime);
            performance.setEndTime(endTime);
        }
    }
    public void editPerformance(Performance performance, Stage stage){
        if(bookingAvailable(performance) == true){
            performance.setStage(stage);
        }
    }
    public void editPerformance(Performance performance, Artist artist){
        if(bookingAvailable(performance) == true){
            performance.setArtist(artist);
        }
    }

    public void removePerformance(Performance performance){
        for(int i = 0; i< performances.size(); i++){
            if(performances.get(i).equals(performance)){
                performances.remove(i);
            }
        }
    }

    public boolean bookingAvailable(Performance performance){
        boolean doubleBooking = false;
        boolean noOverlappingTime = true;
        for(int i = 0 ; i < performances.size(); i++){
            if(performances.get(i).getStage().equals(performance.getStage())){
                if(performances.get(i).getBeginTime() <= performance.getBeginTime() && performances.get(i).getBeginTime() <= performance.getEndTime() || performances.get(i).getBeginTime() >= performance.getEndTime() && performances.get(i).getEndTime() >= performance.getEndTime()){
                    noOverlappingTime = true;
                }
                else{
                    noOverlappingTime = false;
                }
            }
            if(performances.get(i).getArtist().equals(performance.getArtist())){
                if(performances.get(i).getBeginTime() <= performance.getBeginTime() && performances.get(i).getBeginTime() <= performance.getEndTime() || performances.get(i).getBeginTime() >= performance.getEndTime() && performances.get(i).getEndTime() >= performance.getEndTime()){
                    doubleBooking = false;
                }
                else{
                    doubleBooking = true;
                }
            }
        }
        if(doubleBooking == false && noOverlappingTime == true){
            return true;
        }
        else
            return false;
    }
}


