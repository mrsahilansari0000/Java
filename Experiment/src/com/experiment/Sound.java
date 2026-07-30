package com.experiment;

import javax.sound.sampled.*;
import java.io.File;

public class Sound {
    public static void main(String[] args) {
        try {
            File soundFile = new File("sound.wav"); // apni funny sound yaha rakho
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Thoda delay taki sound complete baj jaye
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}