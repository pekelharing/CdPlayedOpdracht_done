package model;

import java.util.Stack;

public class MusicCue {

    private final Stack<CdPlayer> cd = new Stack<>();

    public void save(CdPlayer cdPlayer) {
        
        //TODO implement this method to save a memento object
        cdPlayer.play("Boléro");
    }

    public void previous(CdPlayer cdPlayer) {
        //TODO implement this method that returns the most recent addition to the music queue AND removes it from the queue

        cdPlayer = cd.pop(-1);
        cdPlayer = cd.push(1) +1;
        cdPlayer = cd.remove(1);

        return;
    }
}