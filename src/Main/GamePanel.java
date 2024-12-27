package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    //set settings
    final int OriginalTileSize = 16;
    final int scale = 3;

    final int tileSize = OriginalTileSize * scale;
    final int MaxScreenCol = 16;
    final int MaxScreenRow = 12;
    final int ScreenWidth = tileSize * MaxScreenCol;
    final int ScreenHeight = tileSize * MaxScreenRow;

    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

}
