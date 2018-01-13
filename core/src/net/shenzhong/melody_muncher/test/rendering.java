package net.shenzhong.melody_muncher.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import net.shenzhong.melody_muncher.Game;
import net.shenzhong.melody_muncher.Scene;

/**
 * Test basic rendering
 *
 * @see Texture
 * @see Scene
 */
public class rendering extends Scene {
    Texture img1;

    @Override
    public void create() {
        super.create();
        img1 = new Texture("badlogic.jpg");
        new Timer().scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                Game.getInstance().setCurrentScene(new animation());
            }
        }, 1);
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(img1, 0, 0);
        batch.end();

    }
}
