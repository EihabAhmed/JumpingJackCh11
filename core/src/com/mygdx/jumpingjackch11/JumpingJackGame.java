package com.mygdx.jumpingjackch11;

public class JumpingJackGame extends BaseGame {
	public void create() {
		super.create();
		setActiveScreen(new LevelScreen());
	}
}
