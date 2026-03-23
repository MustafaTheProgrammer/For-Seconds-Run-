import java.util.ArrayList;

public class Tiles{
    public float x;
    public float y;
    public String type;
    public int buttonID;
    public static ArrayList<Tiles> list = new ArrayList<Tiles>();

    public Tiles(float x, float y, String type, int buttonID){
        this.x = x;
        this.y = y;
        this.type = type;
        this.buttonID = buttonID;
    }
}