import java.util.ArrayList;

public class Enemy{
    public float x;
    public float y;
    public float xv;
    public String type;
    public int timer;
    public int var;
    public boolean alive = true;
    public static ArrayList<Enemy> list = new ArrayList<Enemy>();
    
    public Enemy(float x, float y, float xv, String type){
        this.x = x;
        this.y = y;
        this.xv = xv;
        this.type = type;
    }

    public void shooter(){
        this.timer++;
        if (this.timer == 20){
            if (this.type == "shooter-u"){
                this.list.add(new Enemy(this.x + 1, this.y + 6, 0, "lazer-u"));
            }
            else if (this.type == "shooter-l"){
                this.list.add(new Enemy(this.x - 60 , this.y + 1, 0, "lazer-l"));
            }
            else if (this.type == "shooter-r"){
                this.list.add(new Enemy(this.x + 6, this.y + 1, 0, "lazer-r"));
            }
        }
        if (this.timer == 25){
            timer = 0;
        }
    }

    public void lazer(){
        this.timer++;
        if (this.timer == 5){
            this.alive = false;
        }
    }

    public void boom(){
        this.timer++;
        if (this.timer == 5){
            this.alive = false;
        }
    }
}