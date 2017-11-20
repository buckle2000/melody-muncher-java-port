package net.shenzhong.melody_muncher;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Comparator;

public class Scene extends ApplicationAdapter {
    protected SpriteBatch batch;
    protected ArrayList<GameObject> gameObjects;

    @Override
    public void create() {
        batch = new SpriteBatch();
        gameObjects = new ArrayList<>();
    }

    @Override
    public void render() {
        // Sort by z order
        // TODO cache this
        gameObjects.sort(Comparator.comparing(GameObject::getZ));
        // Update
        gameObjects.forEach(gameObject -> gameObject.update(Gdx.graphics.getDeltaTime()));
        batch.begin();
        gameObjects.forEach(gameObject -> gameObject.render(batch));
        batch.end();
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
