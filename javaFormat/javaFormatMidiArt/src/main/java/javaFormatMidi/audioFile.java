package javaFormatMidi;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class audioFile {

    // declares variables
    private Clip clip;
    private AudioInputStream audioInputStream;

    // static array that holds the different paths
    //private String[] array = { "Kickproject20130303(Grund)" };

    public void play(String str) {
        // play method

        try {
            // initializes AudioInputStream object
            audioInputStream = AudioSystem.getAudioInputStream(filePath(str));

            // initializes "format" to get the encoding of
            // the file
            AudioFormat format = audioInputStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);

            clip.loop(0);
        } catch (Exception e) {

        }
    }

    public void playLoop(String str) {

        // loop method

        try {
            // initializes AudioInputStream object
            audioInputStream = AudioSystem.getAudioInputStream(filePath(str));

            // initializes "format" to get the encoding of
            // the file
            AudioFormat format = audioInputStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {

        }

    }

    public File filePath(String fileStr) {
        // method to set the filepath
        String filepath = fileStr + ".wav";

        File file = new File(filepath);

        return file;
    }

    public void stop() {
        // method to stop the playing sound
        clip.stop();
    }

    public void test(String str) {
        
    }

}
