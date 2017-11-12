package buckle2000.melody_muncher;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import buckle2000.melody_muncher.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input.Keys;

import java.util.ArrayList;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    ArrayList<GameObject> gameObjects;
	Input input;

	@Override
	public void create () {
		batch = new SpriteBatch();
        gameObjects = new ArrayList<>();
        input = new Input();
        input.define("up", new int[]{Keys.UP});
        input.define("left", new int[]{Keys.LEFT});
        input.define("right", new int[]{Keys.RIGHT});
//		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		batch.draw(img, 0, 0);
		batch.end();
	}

    @Override
    public void pause () {
    }

    @Override
    public void resume () {
    }
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
