import Performance.*;

import java.util.LinkedList;
import java.util.List;

public class Timetable {

    private List<Performance> performances = new LinkedList<>();


    public Timetable(){
    }

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
                if(performances.get(i).getBeginTime() <= temp.getBeginTime() && performances.get(i).getEndTime() <= temp.getBeginTime() || performances.get(i).getBeginTime() >= temp.getEndTime() && performances.get(i).getEndTime() >= temp.getEndTime()){
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

    public void editPerformance(Performance performance, Artist artist, int beginTime, int endTime, Stage stage){
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
            if(noOverlappingTime == true && doubleBooking == false){
                performance.setBeginTime(beginTime);
                performance.setEndTime(endTime);
                performance.setStage(stage);
                performance.setArtist(artist);
            }
        }
    }
    public void editPerformance(Performance performance, int beginTime, int endTime, Stage stage){
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
            if(noOverlappingTime == true && doubleBooking == false){
                performance.setBeginTime(beginTime);
                performance.setEndTime(endTime);
                performance.setStage(stage);
            }
        }
    }
    public void editPerformance(Performance performance, int beginTime, int endTime){
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
            if(noOverlappingTime == true && doubleBooking == false){
                performance.setBeginTime(beginTime);
                performance.setEndTime(endTime);
            }
        }

    }
    public void editPerformance(Performance performance, Stage stage){
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
            if(noOverlappingTime == true && doubleBooking == false){
                performance.setStage(stage);
            }
        }
    }
    public void editPerformance(Performance performance, Artist artist){
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
            if(noOverlappingTime == true && doubleBooking == false){
                performance.setArtist(artist);
            }
        }
    }

    public void removePerformance(Performance performance){
        for(int i = 0; i< performances.size(); i++){
            if(performances.get(i).equals(performance)){
                performances.remove(i);
            }
        }
    }
}


