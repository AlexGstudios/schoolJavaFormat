package javaFormatMidi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uiListener implements ActionListener {

    private audioFile aF = new audioFile();
    private String letter = "";
    private static String toggleLetter = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        // function that starts playing a sound when a button
        // on the UI is pressed and stops it if the same button is pressed again

        // if-statement to check if the loop button has been pressed
        if (e.getActionCommand() == "loop") {
            if (toggleLetter == "loop") {
                toggleLetter = "";
            } else {
                toggleLetter = "loop";
            }
        }

        if (e.getActionCommand() != "loop") {
            if (toggleLetter == "loop") {
                if (letter == e.getActionCommand()) {
                    aF.stop();
                    letter = "";
                } else {
                    letter = e.getActionCommand();
                    aF.playLoop(letter);
                }
            } else if (toggleLetter == "") {
                letter = e.getActionCommand();
                aF.play(letter);
                // if (letter == e.getActionCommand()) {
                // aF.stop();
                // letter = "";
                // } else {
                // letter = e.getActionCommand();
                // aF.play(letter);
                // }
            }
        }

    }
}
