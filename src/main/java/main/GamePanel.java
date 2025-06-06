package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    ///Set up the ***settings***
    public final int OriginalTileSize = 16;
    public final int scale = 3;

    public final int tileSize = OriginalTileSize * scale;
    final int MaxScreenCol = 16;
    final int MaxScreenRow = 12;
    final int ScreenWidth = tileSize * MaxScreenCol;
    final int ScreenHeight = tileSize * MaxScreenRow;

    ///***FPS***
    int FPS=60;

    /// Initialize **vars**
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    entity.Player player = new entity.Player(this, keyH);

    ///Set ***Player's*** default pos<br>
    /// ***NOT NEEDED NOW***
    int PlayerX = 100;
    int PlayerY = 100;
    int PlayerSpeed = 4;

    /**
     * Initializes the <b>game panel</b>
     */
    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
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

        double drawInterval = 1000000000/FPS;
        double NextDrawTime= System.nanoTime() + drawInterval;

        while (gameThread != null) {
            update();

            /// The ``repaint()`` function runs the ``paint component`` function
            repaint();

            try {
                double remaningTime = NextDrawTime-System.nanoTime();
                remaningTime=remaningTime/1000000;

                if (remaningTime<0) {remaningTime=0;}

                Thread.sleep((long)remaningTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            NextDrawTime+=drawInterval;

        }

    }

    /**
     * updates the game
     */
    public void update() {
        player.update();
    }

    /**
     * adds a component to the <b>screen</b>
     * @param g is of type {@code Graphics}
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        player.draw(g2);

        g2.dispose();

    }


}
