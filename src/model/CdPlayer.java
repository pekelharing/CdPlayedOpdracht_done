package model;


public class CdPlayer {

    private String currentSong;

    String track1 = "Boléro";
    String track2 = "Mass in B Mino";
    String track3 = "Symphony No.2 in E minor";
    String track4 = "Pathetique Sonata";
    String track5 = "Ave Maria";
    String track6 = "The Blue Danube";
    String track7 = "Adagio for strings";
    String track8 = "Vocalise, Op.34, No.14";

    public void play(String song) {
        this.currentSong = song;
    }
    private String getCurrentSong() {
        return currentSong;
    }

    //TODO Create a method that creates a copy of CdPlayer's current state

    public String getTrack1() {return currentSong; }

    @Override
    public String toString() {
        return "Now playing: " + currentSong;
    }





}
