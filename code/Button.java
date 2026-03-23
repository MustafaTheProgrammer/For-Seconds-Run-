import java.util.ArrayList;

public class Button{
    public float x;
    public float y;
    public boolean on = true;
    public static ArrayList<Button> list = new ArrayList<Button>();
    public Button(float x, float y){
        this.x = x;
        this.y = y;
    }
}