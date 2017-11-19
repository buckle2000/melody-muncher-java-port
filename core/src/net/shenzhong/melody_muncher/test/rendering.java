package net.shenzhong.melody_muncher.test;

import com.badlogic.gdx.graphics.Texture;
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
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(img1, 0, 0);
        batch.end();
    }
}
