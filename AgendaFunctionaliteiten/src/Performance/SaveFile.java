package Performance;

import java.util.ArrayList;

public class SaveFile  {
        ArrayList<Artist> savelist1 = new ArrayList<>();
        ArrayList<Artist> savelist2 = new ArrayList<>();
        ArrayList<Artist> savelist3 = new ArrayList<>();
        ArrayList<Artist> savelist4 = new ArrayList<>();

    public void saveFile(Artist artist){
        if(GUI.saveFile == file1) {
                this.savelist1.add(artist);
        }
        if(GUI.saveFile == file2) {
            this.savelist2.add(artist);
        }
        if(GUI.saveFile == file3) {
            this.savelist3.add(artist);
        }
        if(GUI.saveFile == file4) {
            this.savelist4.add(artist);
        }
    }

    public void print(){
            System.out.println(this.savelist1);
            System.out.println(this.savelist2);
            System.out.println(this.savelist3);
            System.out.println(this.savelist4);
        }
    }


