package model;

public class Main {

    public static void main(String[] args) {


        //TODO create a memento class, and in this method add the 8 tracks to the cd,
        // save every track in the music queue and then go all the way back to Boléro

        CdPlayer cdPlayer = new CdPlayer();
        MusicCue musicCue = new MusicCue();
        cdPlayer.play(cdPlayer.track1);
        musicCue.save(cdPlayer);




    }
}
