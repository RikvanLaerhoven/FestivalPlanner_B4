package tiledMapClasses;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import static java.lang.Math.toIntExact;


public class Tileset {

    private BufferedImage[] tiles;
    private org.json.simple.parser.JSONParser jsonParser;
    private FileReader fileReader;
    private ArrayList<Object[]> layers;
    private File jsonFile;

    public Tileset() throws IOException, ParseException {

        this.jsonParser = new JSONParser();
        try {
            this.tiles = new BufferedImage[2715];
            this.jsonFile = new File("recourses/JSONmap/PukkelpopMap.json");
                this.fileReader = new FileReader(jsonFile);
                BufferedImage ground_tilesV2 = ImageIO.read(new File("recourses/tileset/ground_tilesV2.png"));
                BufferedImage ground_tilesV3 = ImageIO.read(new File("recourses/tileset/ground_tilesV3.png"));

                int j = 0;
                for(int i = 0; i < 2710; i++){
                    if(i<2016){
                        this.tiles[i] = ground_tilesV2.getSubimage(32 * (j % 32), 32 * (j / 32), 32, 32);
                        j++;
                        if(i==2015){
                            j=0;
                        }
                        else if(i <2272){
                            this.tiles[i] = ground_tilesV3.getSubimage(32 * (j % 32), 32 * (j / 32), 32, 32);
                            j++;
                            if (i == 2271) {
                                j=0;
                            }
                        }
                    }
                }


        }
        catch (Exception e){
            e.printStackTrace();
        }

        this.layers = getJsonValues();
    }
    public BufferedImage getTile(int i) {
        return this.tiles[i];
    }

    public ArrayList<Object[]> getJsonValues() throws IOException, ParseException {
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
        JSONArray layers = (JSONArray) jsonObject.get("layers");
        Iterator i = layers.iterator();
        ArrayList<Object[]> dataValues = new ArrayList<>();
        while (i.hasNext()) {

            JSONObject layer = (JSONObject) i.next();
            JSONArray data = (JSONArray) layer.get("data");
            Object[] dataLong = data.toArray();
            dataValues.add(dataLong);
        }
        return dataValues;
    }

    public long getValue(int tileValue, int layer) {

        try {
            if (((long) this.layers.get(layer)[tileValue])<10000){
                return toIntExact((long) this.layers.get(layer)[tileValue]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return 2700;
    }

    public static void main(String[] args) throws IOException, ParseException {
        Tileset tileset = new Tileset();
        long i = tileset.getValue(0,0);
        System.out.println(i);
    }
}

