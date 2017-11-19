package net.shenzhong.melody_muncher;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.sun.istack.internal.NotNull;

import java.util.Timer;

public class Game extends ApplicationAdapter {
    protected Scene currentScene;

    public
    @NotNull
    Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(@NotNull Scene currentScene) {
        currentScene.create();
        this.currentScene.dispose();
        this.currentScene = currentScene;
    }

    private Timer timer;

    @Override
    public void create() {
        currentScene = Config.defaultScene;
        currentScene.create();
    }

    @Override
    public void render() {
        // Clear screen to white
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        currentScene.render();
    }

    @Override
    public void pause() {
        currentScene.pause();
    }

    @Override
    public void resume() {
        currentScene.resume();
    }

    @Override
    public void dispose() {
        currentScene.dispose();
    }
}
