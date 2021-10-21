package com.company;

public class Main {

    public static void main(String[] args) {
        VideoPlayerFactory videoPlayerFactory = content("4k video");
        VideoPlayer videoPlayer = videoPlayerFactory.player();

        videoPlayer.playVideo();

    }

    static VideoPlayerFactory content(String content){
        if(content.equalsIgnoreCase("4k video")){
            return new MediaElementFactory();
        }else if(content.equalsIgnoreCase("Full HD video")){
            return new ProjekktorFactory();
        }else {
            throw new RuntimeException(content + " is not supported with the video player");
        }
    }
}
