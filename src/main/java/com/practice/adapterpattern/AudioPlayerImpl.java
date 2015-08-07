package com.practice.adapterpattern;

public class AudioPlayerImpl implements AudioPlayer{

	Adapter adapter;
	public void play(String type, String filename) {
		if(type.equals("Simple")){
			System.out.println("Playing simple");
		}else if(type.equals("mp3")||type.equals("mp4")){
			adapter=new Adapter();
			adapter.play(type, filename);
		}
		else{
			System.out.println("Media not supported");
		}
		
		
	}

	
}
