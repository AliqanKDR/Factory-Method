package com.company;

public class MediaElementVideoPlayer implements VideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("The video is being played by MediaElement");
    }
}
