package javaFormatMidi;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class interfaceUI {
    // array of strings to set what the buttons will display in them
    private static String[] l = { "snare", "tom1", "cymbal", "hihat", "kick", "tom2", "loop"};

    public void uI() {
        // creating a window, sets the window size, layout
        // and what happemds when the x is pressed on the window
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // initializes the buttons
        JButton[] button = new JButton[7];

        // creates the nunber of buttins, button.length
        // and adds them to the window
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(l[i]);
            button[i].setSize(50, 50);
            // adds a ActionListener to check when the buttons
            // in the window is pressed
            button[i].addActionListener(new uiListener());
            // adds a keyListener to check when the buttons
            // on the keyboard is pressed
            button[i].addKeyListener(new midiKeyEvent());
            frame.add(button[i]);
        }
        
        frame.setSize(600, 200);

    }
}
