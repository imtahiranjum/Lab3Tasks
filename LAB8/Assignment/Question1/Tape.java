package com.company;

public class Tape extends Publication {
    public double playingTime;

    public Tape(){
        super();
        setPlayingTime(250);
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

    public double getPlayingTime() {
        return playingTime;
    }

    @Override
        public void display(){
            System.out.print("\nPlay Time: "+getPlayingTime()+"\n");
    }
}
