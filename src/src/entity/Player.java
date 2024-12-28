package entity;

import Main.*;

import javax.imageio.*;
import java.awt.*;
import java.io.IOException;

public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler KeyH) {
        this.gp = gp;
        this.keyH = KeyH;

        setDefaultValues();

    }

    public void getPlayerImages() {
        try{
            Up1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_up_1.png"));
            Up2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_up_2.png"));
            Down1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_down_1.png"));
            Down2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_down_2.png"));
            Left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left_1.png"));
            Left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left_2.png"));
            Right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right_1.png"));
            Right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right_2.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setDefaultValues() {
        x=100;
        y=100;
        speed=4;
    }

    public void update() {
        if (keyH.UpPressed==true) {y-=speed;}
        else if (keyH.DownPressed==true) {y+=speed;}
        else if (keyH.LeftPressed==true) {x+=speed;}
        else if (keyH.RightPressed==true) {x-=speed;}
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);

        g2.fillRect(x,y,48,48);
    }

}
