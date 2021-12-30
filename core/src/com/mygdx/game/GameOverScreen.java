package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameOverScreen extends ScreenAdapter{
	
	MyGdxGame game;
	
	public GameOverScreen(MyGdxGame game) {
		this.game = game;

		Gdx.input.setInputProcessor(new input());
	}
	
	@Override
	public void render (float delta) {
		ScreenUtils.clear(Color.RED);
		
		game.batch.begin();
		game.font.draw(game.batch, "Your Score was: " + game.score, Gdx.graphics.getWidth() / 2 + 30, Gdx.graphics.getHeight() / 2 + 30);
		game.font.draw(game.batch, "Game Over!", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		game.font.draw(game.batch, "Press escape to quit OR space to play again", Gdx.graphics.getHeight() / 2 - 40, Gdx.graphics.getWidth() / 2);
		game.batch.end();
	}

	private class input extends InputAdapter {
		public input() {
			//blank
		}

		@Override
		public boolean touchDown(int screenX, int screenY, int pointer, int button) {
			if (button == Input.Buttons.LEFT) {
				colorPicker tep = new colorPicker();
				game.render.setColor(tep.colorPicker());
				game.setScreen(new GameScreen(game));
			}
			/*else if (keyCode == Input.Keys.ESCAPE) {
				Gdx.app.exit();
				System.exit(0);
			}
			*/
			return true;
		}

	}

}