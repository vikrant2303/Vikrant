package com.practice.adapterpattern;

public class Adapter implements AudioPlayer {

	AdvancedPlayer advancedPlayer;

	public Adapter() {
		advancedPlayer = new AdvancedPlayerImpl();
	}

	public void play(String type, String filename) {
		if (type.equals("mp3")) {
			advancedPlayer.playmp3(filename);
		}
		else{
			advancedPlayer.playmp4(filename);
		}

	}

}
