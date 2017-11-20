package net.shenzhong.melody_muncher.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import net.shenzhong.melody_muncher.RegularAtlas;
import net.shenzhong.melody_muncher.Scene;

/**
 * Test atlas loading and basic animation
 */
public class animation extends Scene {
    Texture img1;
    int currentFrame = 0;
    RegularAtlas atlas;

    @Override
    public void create() {
        super.create();
        img1 = new Texture("img/player.png");
        atlas = new RegularAtlas(img1, 150, 100);
        new Timer().scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                currentFrame = (currentFrame + 1) % atlas.getFrameCount();
            }
        }, 0, 0.2f);
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(atlas.getFrame(currentFrame), 0, 0);
        batch.end();
    }
}
