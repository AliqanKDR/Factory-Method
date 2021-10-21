package com.company;

public class ProjekktorFactory implements VideoPlayerFactory{
    @Override
    public VideoPlayer player() {
        return new ProjekktorVideoPlayer();
    }
}
