package main.java.entity;

import main.java.Main.*;

import java.awt.*;

public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler KeyH) {
        this.gp = gp;
        this.keyH = KeyH;

        setDefaultValues();

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
