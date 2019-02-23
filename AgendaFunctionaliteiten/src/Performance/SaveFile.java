package Performance;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveFile  {
        ArrayList<Performance> savelist1 = new ArrayList<>();
    ArrayList<Performance> savelist2 = new ArrayList<>();
    ArrayList<Performance> savelist3 = new ArrayList<>();
    ArrayList<Performance> savelist4 = new ArrayList<>();

    public ArrayList<Performance> getSavelist1() {
        return savelist1;
    }

    public void setSavelist1(ArrayList<Performance> savelist1) {
        this.savelist1 = savelist1;
    }

    public ArrayList<Performance> getSavelist2() {
        return savelist2;
    }

    public void setSavelist2(ArrayList<Performance> savelist2) {
        this.savelist2 = savelist2;
    }

    public ArrayList<Performance> getSavelist3() {
        return savelist3;
    }

    public void setSavelist3(ArrayList<Performance> savelist3) {
        this.savelist3 = savelist3;
    }

    public ArrayList<Performance> getSavelist4() {
        return savelist4;
    }

    public void setSavelist4(ArrayList<Performance> savelist4) {
        this.savelist4 = savelist4;
    }



    public void saveFile(Performance performance) {
        try {
            File file1 = new File("scores.txt");
            File file2 = new File("scores.txt");
            File file3 = new File("scores.txt");
            File file4 = new File("scores.txt");

            PrintWriter output = null;

            if (GUI.saveFile == file1) {

                output.print(performance);
                this.savelist1.add(performance);
            }
            if (GUI.saveFile == file2) {

                output.print(performance);
                this.savelist2.add(performance);
            }
            if (GUI.saveFile == file3) {

                output.print(performance);
                this.savelist3.add(performance);
            }
            if (GUI.saveFile == file4) {

                output.print(performance);
                this.savelist4.add(performance);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            output.close();
        }
    }

    public void print(){
            System.out.println(this.savelist1);
            System.out.println(this.savelist2);
            System.out.println(this.savelist3);
            System.out.println(this.savelist4);
        }
    }


