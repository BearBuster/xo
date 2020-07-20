package com.mygdx.xo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import view.GameScreen;

public class MyGdxGame extends Game {

	private Screen gameScreen;
	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}
