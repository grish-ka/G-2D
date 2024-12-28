package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean UpPressed, DownPressed, LeftPressed, RightPressed;

    /**
     * <b>This function is not needed right now</b>
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {

        ///Check what **key** was pressed
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {UpPressed=true;}

        if (code == KeyEvent.VK_S) {DownPressed=true;}

        if (code == KeyEvent.VK_A) {LeftPressed=true;}

        if (code == KeyEvent.VK_D) {RightPressed=true;}

    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        ///Check what ***key*** was pressed
        if (code == KeyEvent.VK_W) {UpPressed=false;}

        if (code == KeyEvent.VK_S) {DownPressed=false;}

        if (code == KeyEvent.VK_A) {LeftPressed=false;}

        if (code == KeyEvent.VK_D) {RightPressed=false;}

    }
}
