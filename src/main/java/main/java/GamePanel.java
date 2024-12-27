package main.java;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    //set settings
    final int OriginalTileSize = 16;
    final int scale = 3;

    final int tileSize = OriginalTileSize * scale;
    final int MaxScreenCol = 16;
    final int MaxScreenRow = 12;
    final int ScreenWidth = tileSize * MaxScreenCol;
    final int ScreenHeight = tileSize * MaxScreenRow;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    /**
     * The {@code startGameThread()} function starts the <b>Game Thread</b>
     */
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    /**
     * The {@code run()} function is the <b>Game Loop</b>
     */
    @Override
    public void run() {

        while (gameThread != null) {
            System.out.println("The game loop is running");
        }

    }
}
