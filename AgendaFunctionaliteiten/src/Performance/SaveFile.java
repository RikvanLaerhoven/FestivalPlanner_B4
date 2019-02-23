package Performance;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveFile  {
        ArrayList<Artist> savelist1 = new ArrayList<>();
    ArrayList<Artist> savelist2 = new ArrayList<>();
    ArrayList<Artist> savelist3 = new ArrayList<>();
    ArrayList<Artist> savelist4 = new ArrayList<>();

    public ArrayList<Performance.Artist> getSavelist1() {
        return savelist1;
    }

    public void setSavelist1(ArrayList<Performance.Artist> savelist1) {
        this.savelist1 = savelist1;
    }

    public ArrayList<Performance.Artist> getSavelist2() {
        return savelist2;
    }

    public void setSavelist2(ArrayList<Performance.Artist> savelist2) {
        this.savelist2 = savelist2;
    }

    public ArrayList<Performance.Artist> getSavelist3() {
        return savelist3;
    }

    public void setSavelist3(ArrayList<Performance.Artist> savelist3) {
        this.savelist3 = savelist3;
    }

    public ArrayList<Performance.Artist> getSavelist4() {
        return savelist4;
    }

    public void setSavelist4(ArrayList<Performance.Artist> savelist4) {
        this.savelist4 = savelist4;
    }



    public void saveFile(Artist artist) {
        try {
            File file1 = new File("scores.txt");
            File file2 = new File("scores.txt");
            File file3 = new File("scores.txt");
            File file4 = new File("scores.txt");

            PrintWriter output = null;

            if (GUI.saveFile == file1) {

                output.print(artist);
                this.savelist1.add(artist);
            }
            if (GUI.saveFile == file2) {

                output.print(artist);
                this.savelist2.add(artist);
            }
            if (GUI.saveFile == file3) {

                output.print(artist);
                this.savelist3.add(artist);
            }
            if (GUI.saveFile == file4) {

                output.print(artist);
                this.savelist4.add(artist);
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


