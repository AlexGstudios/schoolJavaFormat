package javaFormatMidi;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class midiKeyEvent implements KeyListener {

    private audioFile aF = new audioFile();

    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'q':
                aF.play("hihat");
                break;
            case 'w':
                aF.play("tom1");
                break;
            case 'e':
                aF.play("cymbal");
                break;
            case 'a':
                aF.play("snare");
                break;
            case 's':
                aF.play("kick");
                break;
            case 'd':
                aF.play("tom2");
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}