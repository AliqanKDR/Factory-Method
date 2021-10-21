package com.company;

public class MediaElementFactory implements VideoPlayerFactory{
    @Override
    public VideoPlayer player() {
        return new MediaElementVideoPlayer();
    }
}
