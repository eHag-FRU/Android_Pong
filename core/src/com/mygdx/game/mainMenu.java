package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import java.io.*;

public class mainMenu extends ScreenAdapter {
	
	MyGdxGame game;
	
	ShapeRenderer render;
	BitmapFont font;
	SpriteBatch batch;
	
	public mainMenu(MyGdxGame game) {
		this.game = game;
		
		render = game.render;
		font = game.font;
		batch = game.batch;
		
	}
	
	@Override
	public void show() {
		Gdx.input.setInputProcessor(new MenuInput());
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		font.draw(batch, "Pong", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		batch.end();
	
	}
	
	@Override
	public void dispose() {
		
	}
	
	
	private class MenuInput extends InputAdapter {
		public MenuInput() {
			
			
		}
		
		@Override
		public boolean touchDown(int screenX, int screenY, int pointer, int button) {
			
			if (button == Input.Buttons.LEFT) {
				game.setScreen(new GameScreen(game));
			}
			
			return true;
		}
	}
}

